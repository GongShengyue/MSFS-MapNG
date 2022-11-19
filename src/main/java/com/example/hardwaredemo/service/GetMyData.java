package com.example.hardwaredemo.service;

import com.example.hardwaredemo.entity.VarEntity;
import com.example.hardwaredemo.entity.VarResult;
import flightsim.simconnect.SimConnectDataType;


import java.util.ArrayList;
import java.util.List;

/**
 * 获取我需要的文件
 */
public class GetMyData extends Thread {
    private static List<VarEntity> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add(new VarEntity("PLANE ALTITUDE", "feet", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("PLANE LATITUDE", "degrees", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("PLANE LONGITUDE", "degrees", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("PLANE HEADING DEGREES GYRO", "degrees", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("Airspeed Indicated", "knots", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("FLAPS HANDLE INDEX", "Number", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("FLAP POSITION SET", "Position", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("AMBIENT PRECIP RATE", "millimeters of water", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("AMBIENT WIND DIRECTION", "Degrees", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("AMBIENT WIND VELOCITY", "knots", SimConnectDataType.FLOAT64));

//        list.add(new VarEntity("WaypointAirportCity","string", SimConnectDataType.STRING64));
//        list.add(new VarEntity("WaypointAirportName","string",SimConnectDataType.STRING64));
        list.add(new VarEntity("LIGHT NAV", "Bool", SimConnectDataType.FLOAT64));
        list.add(new VarEntity("GEAR POSITION", "enum", SimConnectDataType.INT32));
        list.add(new VarEntity("BRAKE INDICATOR", "Position", SimConnectDataType.INT32));

        try{
            Thread t = new DataThread();
            t.start();
            sleep(1001);
            VarResult result= GetVariable.varResult;
            System.out.println(result.toString());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    static class DataThread extends Thread{
        @Override
        public void run(){
            System.out.println(Thread.currentThread().toString());
            try {
                GetVariable.getVarResult(list);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }


}
