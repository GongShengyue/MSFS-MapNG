//package com.example.hardwaredemo.service;
//
//import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
//import org.springframework.stereotype.Service;
//import oshi.SystemInfo;
//import oshi.hardware.CentralProcessor;
//import oshi.hardware.GlobalMemory;
//import oshi.hardware.HardwareAbstractionLayer;
//import oshi.hardware.Sensors;
//@Service
//public class RAMService {
//    private SystemInfo si = new SystemInfo();
//    private HardwareAbstractionLayer hal = si.getHardware();
//    private GlobalMemory memory = hal.getMemory();
//
//    public  long getTotal(){
//        long t =  memory.getTotal();
//        long t_GB = t/(1024^3);
//        return t_GB;
//    }
//    public long getAvailable(){
//        long t = memory.getAvailable();
//        long t_GB = t/(1024^3);
//        return t_GB;
//    }
//
//
//
//
//}
