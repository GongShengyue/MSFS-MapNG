package com.example.hardwaredemo.service;

import com.example.hardwaredemo.entity.VarEntity;
import com.example.hardwaredemo.entity.VarResult;
import flightsim.simconnect.SimConnectDataType;


import java.util.ArrayList;
import java.util.List;

/**
 * 获取我需要的文件
 */
public class GetMyData {
    public static void main(String[] args) {
        List<VarEntity> list = new ArrayList<>();
        list.add(new VarEntity("PLANE ALTITUDE","feet",SimConnectDataType.FLOAT64));
        list.add(new VarEntity("PLANE LATITUDE","degrees",SimConnectDataType.FLOAT64));
        list.add(new VarEntity("PLANE LONGITUDE","degrees",SimConnectDataType.FLOAT64));
        list.add(new VarEntity("HEADING INDICATOR","degrees",SimConnectDataType.FLOAT64));
        list.add(new VarEntity("Airspeed Indicated","knots",SimConnectDataType.FLOAT64));
        list.add(new VarEntity("FLAPS HANDLE INDEX","Number",SimConnectDataType.FLOAT64));
        list.add(new VarEntity("FLAP POSITION SET","Position",SimConnectDataType.FLOAT64));
        list.add(new VarEntity("AMBIENT PRECIP RATE","millimeters of water",SimConnectDataType.FLOAT64));
        list.add(new VarEntity("AMBIENT WIND DIRECTION","Degrees",SimConnectDataType.FLOAT64));
        list.add(new VarEntity("AMBIENT WIND VELOCITY","knots",SimConnectDataType.FLOAT64));

//        list.add(new VarEntity("WaypointAirportCity","string", SimConnectDataType.STRING64));
//        list.add(new VarEntity("WaypointAirportName","string",SimConnectDataType.STRING64));
        list.add(new VarEntity("LIGHT NAV","Bool",SimConnectDataType.FLOAT64));
        list.add(new VarEntity("GEAR POSITION","enum",SimConnectDataType.INT32));
        list.add(new VarEntity("BRAKE INDICATOR","Position",SimConnectDataType.INT32));
        try{
//            GetVariable.getVar(list);
            VarResult result= GetVariable.getVarResult(list);
            System.out.println(result.toString());
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
