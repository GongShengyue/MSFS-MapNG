package com.example.hardwaredemo.service;

import com.example.hardwaredemo.entity.VarEntity;
import com.example.hardwaredemo.entity.VarResult;
import flightsim.simconnect.SimConnect;
import flightsim.simconnect.SimConnectPeriod;
import flightsim.simconnect.recv.*;
import java.util.List;

public class GetVariable {




	public static VarResult varResult = new VarResult();

//	private static SimConnect sc;


//		if (args.length > 3) {
//			p = SimConnectPeriod.valueOf(args[3].toUpperCase());
//		}

//		if ("null".equalsIgnoreCase(units)) units = null;

//	public static void main(final String[] args) throws IOException, ConfigurationNotFoundException {
//		if (args.length < 1) {
//			System.err.println("Usage: GetVariable <variable name> [units] [cid] [repeat]");
//			System.err.println("Units may be NULL which means no units sent");
//			System.err.println("CID is in hex form. 0 = user plane");
//			System.err.println("Repeat type may be SECOND, ONCE (default), SIM_FRAME, etc");
//			System.exit(0);
//		}
//
//		SimConnect sc = new SimConnect("GetVariable", 0);
//		int cid = 0;
//		if (args.length > 2) {
//			cid = Integer.parseInt(args[2], 16);
//		}
//		SimConnectPeriod p = SimConnectPeriod.ONCE;
//		if (args.length > 3) {
//			p = SimConnectPeriod.valueOf(args[3].toUpperCase());
//		}
//		String units = null;
//		if (args.length > 1) units = args[1];
//		if ("null".equalsIgnoreCase(units)) units = null;
//		sc.addToDataDefinition(1, args[0],units, SimConnectDataType.FLOAT64);
//		sc.requestDataOnSimObject(1, 1, cid, p);
//
//		DispatcherTask dt = new DispatcherTask(sc);
//		dt.addOpenHandler(new OpenHandler(){
//			public void handleOpen(SimConnect sender, RecvOpen e) {
//				System.out.println("Connected to " + e.getApplicationName());
//			}
//		});
//		dt.addExceptionHandler(new ExceptionHandler(){
//			public void handleException(SimConnect sender, RecvException e) {
//				System.out.println("Exception (" + e.getException() +") packet " + e.getSendID());
//			}
//		});
//		dt.addSimObjectDataHandler(new SimObjectDataHandler(){
//			public void handleSimObject(SimConnect sender, RecvSimObjectData e) {
//				System.out.println("Value of '" + args[0] + "' = " + e.getDataFloat64());
//
//			}
//		});
//		while (true) {
//			sc.callDispatch(dt);
//		}
//
//	}
//
//	public static void getVar(List<VarEntity> list) throws IOException, ConfigurationNotFoundException{
//		SimConnect sc = new SimConnect("GetVariable", 0);
//		int cid = 0;
//
//		SimConnectPeriod p = SimConnectPeriod.SECOND;
////		if (args.length > 3) {
////			p = SimConnectPeriod.valueOf(args[3].toUpperCase());
////		}
//
////		if ("null".equalsIgnoreCase(units)) units = null;
//		for(VarEntity var : list){
//
//			sc.addToDataDefinition(1, var.getVariableName(),var.getUnits(), var.getType());
//
//		}
//		sc.requestDataOnSimObject(1, 1, cid, p);
//
//		DispatcherTask dt = new DispatcherTask(sc);
//		dt.addOpenHandler(new OpenHandler(){
//			public void handleOpen(SimConnect sender, RecvOpen e) {
//				System.out.println("Connected to " + e.getApplicationName());
//			}
//		});
//		dt.addExceptionHandler(new ExceptionHandler(){
//			public void handleException(SimConnect sender, RecvException e) {
//				System.out.println("Exception (" + e.getException() +") packet " + e.getSendID());
//			}
//		});
//		dt.addSimObjectDataHandler(new SimObjectDataHandler(){
//			public void handleSimObject(SimConnect sender, RecvSimObjectData e) {
////				System.out.println("Value of '" + e + "' = " + e.getDataFloat64());
//
//
//
//				for(VarEntity var :list){
//
//					switch (var.getType()){
//						case FLOAT64:System.out.println(var.getVariableName()+":"+e.getDataFloat64());break;
//						case INT32:System.out.println(var.getVariableName()+":"+e.getDataInt32());break;
//						case STRING32:System.out.println(var.getVariableName()+":"+e.getDataString32());break;
//					}
//
//				}
//				System.out.flush();
//			}
//		});
//		while(true){
//			sc.callDispatch(dt);
//		}
//
//
//
//
//	}

	public  static void  getVarResult(List<VarEntity> list) throws Exception{

		SimConnect sc = new SimConnect("GetVariable", 0);
		for(VarEntity var : list){

			sc.addToDataDefinition(1, var.getVariableName(),var.getUnits(), var.getType());

		}
		SimConnectPeriod p = SimConnectPeriod.SECOND;
		int  cid = 0;
		sc.requestDataOnSimObject(1, 1, cid, p);

		DispatcherTask dt = new DispatcherTask(sc);
		dt.addOpenHandler(new OpenHandler(){
			public void handleOpen(SimConnect sender, RecvOpen e) {
				System.out.println("Connected to " + e.getApplicationName());
			}
		});
		dt.addExceptionHandler(new ExceptionHandler(){
			public void handleException(SimConnect sender, RecvException e) {
				System.out.println("Exception (" + e.getException() +") packet " + e.getSendID());
			}
		});

		dt.addSimObjectDataHandler(new SimObjectDataHandler(){
			public void handleSimObject(SimConnect sender, RecvSimObjectData e) {

//
			varResult.setPLANE_ALTITUDE(e.getDataFloat64());
			varResult.setPLANE_LATITUDE(e.getDataFloat64());
			varResult.setPLANE_LONGITUDE(e.getDataFloat64());
			varResult.setHEADING_INDICATOR(e.getDataFloat64());
			varResult.setAirspeed_Indicated(e.getDataFloat64());
			varResult.setFLAPS_HANDLE_INDEX(e.getDataFloat64());
			varResult.setFLAP_POSITION_SET(e.getDataFloat64());
			varResult.setAMBIENT_PRECIP_RATE(e.getDataFloat64());
			varResult.setAMBIENT_WIND_DIRECTION(e.getDataFloat64());
			varResult.setAMBIENT_WIND_VELOCITY(e.getDataFloat64());
			varResult.setLIGHT_NAV(e.getDataFloat64());
			varResult.setGEAR_POSITION(e.getDataInt32());
			varResult.setBRAKE_INDICATOR(e.getDataInt32());
			System.out.println(varResult.toString());
			}
		});

		while (true) {
			sc.callDispatch(dt);
			}
		}



}
