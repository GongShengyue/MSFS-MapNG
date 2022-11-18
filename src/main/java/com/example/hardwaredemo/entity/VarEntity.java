package com.example.hardwaredemo.entity;

import flightsim.simconnect.SimConnectDataType;

public class VarEntity {

    String variableName;
    String units;

    public VarEntity(String variableName, String units) {
        this.variableName = variableName;
        this.units = units;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getRepet() {
        return repet;
    }

    public void setRepet(String repet) {
        this.repet = repet;
    }

    String cid;
    String repet;

    public SimConnectDataType getType() {
        return type;
    }

    public void setType(SimConnectDataType type) {
        this.type = type;
    }

    public VarEntity(String variableName, String units, SimConnectDataType type) {
        this.variableName = variableName;
        this.units = units;
        this.type = type;
    }

    SimConnectDataType type;
}
