package com.example.hardwaredemo.controller;

import com.example.hardwaredemo.entity.VarEntity;
import com.example.hardwaredemo.entity.VarResult;
import com.example.hardwaredemo.service.GetVariable;
import flightsim.simconnect.SimConnectDataType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The interface of Microsoft Flight Simulator 2020
 */
@RestController
@CrossOrigin
public class FlightController {

    private VarResult result = null;

    private Map<String,Object> map = new HashMap();
    private List<VarEntity> list = new ArrayList();

    {
        list.add(new VarEntity("PLANE ALTITUDE", "feet", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("PLANE LATITUDE", "degrees", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("PLANE LONGITUDE", "degrees", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("HEADING INDICATOR", "degrees", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("Airspeed Indicated", "knots", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("FLAPS HANDLE INDEX", "Number", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("FLAP POSITION SET", "Position", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("AMBIENT PRECIP RATE", "millimeters of water", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("AMBIENT WIND DIRECTION", "Degrees", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("AMBIENT WIND VELOCITY", "knots", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("LIGHT NAV", "Bool", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("GEAR POSITION", "enum", SimConnectDataType.INT32));
    }

    @RequestMapping("/getFlightData")
    public Map<String,Object> getData(){

        try{
//            result =getVarResult(list);
            VarResult result = GetVariable.getVarResult(list);
            map.put("data",result);
            map.put("msg","cuccess");

        }catch (Exception e) {
            map.put("msg",e.getMessage());
            e.printStackTrace();
        }
        finally {
            return map;
        }

    }
}
