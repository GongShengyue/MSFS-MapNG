package com.example.hardwaredemo.controller;

import com.example.hardwaredemo.service.CpuService;
import com.example.hardwaredemo.service.GpuService;
import com.example.hardwaredemo.service.MotherboardService;
//import com.example.hardwaredemo.service.RAMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class Infohandle {

    @Autowired
    private CpuService cpuService;
    @Autowired
    private MotherboardService motherboardService;

//    @Autowired
//    private RAMService ramService;

    @Autowired
    private GpuService gpuService;

    @RequestMapping("/getinfo")
    public Map<String,Object> getinfo(){
        Map<String,Object> map = new HashMap<>();
        map.put("cputick",cpuService.getSystemCpuLoadTicks());
        map.put("temprature",cpuService.getTemprature());
        map.put("fanSpeed",cpuService.getFanSpeed());
        map.put("brand",motherboardService.getSystemInfo());
//        map.put("totalRAM",ramService.getTotal());
//        map.put("availableRAM",ramService.getAvailable());
        map.put("gpuinfo",gpuService.getGPUinfo());
        return map;
    }



}
