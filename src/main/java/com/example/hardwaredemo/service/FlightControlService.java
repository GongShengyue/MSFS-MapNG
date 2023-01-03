//package com.example.hardwaredemo.service;
//
//import flightsim.simconnect.SimConnect;
//import flightsim.simconnect.SimConnectDataType;
//import flightsim.simconnect.config.ConfigurationNotFoundException;
//import flightsim.simconnect.recv.*;
//import flightsim.simconnect.wrappers.DataWrapper;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.util.HashMap;
//
///**
// * 航空控制
// */
//@Service
//public class FlightControlService {
//
//
//    public  void setVal(String variableName,String value,String units,SimConnectDataType dataType) throws IOException, ConfigurationNotFoundException {
////        if (args.length < 2) {
////            System.err.println("Usage: SetVariable <variable name> <value> [units] [cid] ");
////            System.err.println("Units may be NULL which means no units sent");
////            System.err.println("CID is in hex form. 0 = user plane");
////            System.exit(0);
////        }
//
//        SimConnect sc = new SimConnect("SetVariable", 0);
//        int cid = 0;
////        if (args.length > 2) {
////            cid = Integer.parseInt(args[3], 16);
////        }
//
//
//        if ("null".equalsIgnoreCase(units)) units = null;
//        sc.addToDataDefinition(1, variableName,units, dataType);
//        DataWrapper dw = new DataWrapper(8);
//        /* 注意此处需要修改  */
////        dw.putFloat64(Double.parseDouble(value));
//        dw.putInt32(Integer.parseInt(value));
//        sc.setDataOnSimObject(1, cid, false, 1 , dw);
//
//        DispatcherTask dt = new DispatcherTask(sc);
//        dt.addOpenHandler(new OpenHandler(){
//            public void handleOpen(SimConnect sender, RecvOpen e) {
//                System.out.println("Connected to " + e.getApplicationName());
//            }
//        });
//        dt.addExceptionHandler(new ExceptionHandler(){
//            public void handleException(SimConnect sender, RecvException e) {
//                System.out.println("Exception (" + e.getException() +") packet " + e.getSendID());
//            }
//        });
//        while (true) {
//            sc.callDispatch(dt);
//        }
//
//    }
//}
