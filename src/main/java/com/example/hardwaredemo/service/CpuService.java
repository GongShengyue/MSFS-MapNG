package com.example.hardwaredemo.service;

import org.springframework.stereotype.Service;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.Sensors;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取CPU信息
 * created by Gong Shengyue
 */
@Service
public class CpuService {
    private SystemInfo si = new SystemInfo();
    private HardwareAbstractionLayer hal = si.getHardware();
    private CentralProcessor cpu = hal.getProcessor();
    private Sensors sensors = hal.getSensors();


    //获取cpu占用
    public double getSystemCpuLoadTicks(){
        double cpuloadtick = cpu.getSystemCpuLoad(1000);
        return cpuloadtick;

    }

    public Double getTemprature(){

        return sensors.getCpuTemperature();
    }
    public Integer getFanSpeed(){
        int[]  speeds = sensors.getFanSpeeds();
        if(null==speeds||speeds.length==0){
            return 0;
        }
        return speeds[0];

    }
    public Map<String,Object> getCpuInfo(){
        Map<String,Object> map = new HashMap<>();
        map.put("cputick",getSystemCpuLoadTicks());
        map.put("temprature",getTemprature());
        map.put("fanSpeed",getFanSpeed());
        return map;
    }

}
