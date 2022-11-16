package com.example.hardwaredemo.service;

import org.springframework.stereotype.Service;
import oshi.SystemInfo;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GpuService {
    private SystemInfo si = new SystemInfo();
    private HardwareAbstractionLayer hal = si.getHardware();

    public List<GraphicsCard> graphicsCards = hal.getGraphicsCards();

    public List<HashMap> getGPUinfo(){
        List<HashMap> list =  new ArrayList();
        for(int i=0;i<graphicsCards.size();i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("deviceid", graphicsCards.get(i).getDeviceId());
            map.put("name", graphicsCards.get(i).getName());
            map.put("Vender", graphicsCards.get(i).getVendor());
            map.put("availableRam", graphicsCards.get(i).getVRam());
            graphicsCards.get(i).getVersionInfo();
            list.add(map);
        }
        return list;
    }


}
