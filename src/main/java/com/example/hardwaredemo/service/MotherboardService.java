package com.example.hardwaredemo.service;

import org.springframework.stereotype.Service;
import oshi.SystemInfo;
import oshi.hardware.Baseboard;
import oshi.hardware.HardwareAbstractionLayer;
@Service
public class MotherboardService {

    private SystemInfo si = new SystemInfo();
    private HardwareAbstractionLayer hal = si.getHardware();

    private Baseboard baseboard = hal.getComputerSystem().getBaseboard();
    //获取系统信息
    public String getSystemInfo(){
        String info = baseboard.getManufacturer();
        return info;
    }

}
