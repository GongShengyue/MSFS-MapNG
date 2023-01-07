package com.example.hardwaredemo.entity;

public class VarResult {
    /**飞机海拔**/
    double PLANE_ALTITUDE;
    /**飞机纬度**/
    double PLANE_LATITUDE;//:4.0717417393529493E-4

    double PLANE_LONGITUDE;//:0.013974632908878046
    double PLANE_HEADING_DEGREES_GYRO;
    double Airspeed_Indicated;//:2.7157802833244205E-4
    double FLAPS_HANDLE_INDEX;//:0.0
    double FLAP_POSITION_SET;//:0.0
    double AMBIENT_PRECIP_RATE;//:0.0
    double AMBIENT_WIND_DIRECTION;//:270.0
    double AMBIENT_WIND_VELOCITY;//:1.0000025236117378
    double LIGHT_NAV;//:0.0
    /**地球表面类型**/
    int SURFACE_TYPE;
    public int getSURFACE_TYPE() {
        return SURFACE_TYPE;
    }

    public void setSURFACE_TYPE(int SURFACE_TYPE) {
        this.SURFACE_TYPE = SURFACE_TYPE;
    }
    public double getPLANE_HEADING_DEGREES_GYRO() {
        return PLANE_HEADING_DEGREES_GYRO;
    }

    public void setPLANE_HEADING_DEGREES_GYRO(double PLANE_HEADING_DEGREES_GYRO) {
        this.PLANE_HEADING_DEGREES_GYRO = PLANE_HEADING_DEGREES_GYRO;
    }

    public int getBRAKE_INDICATOR() {
        return BRAKE_INDICATOR;
    }

    public void setBRAKE_INDICATOR(int BRAKE_INDICATOR) {
        this.BRAKE_INDICATOR = BRAKE_INDICATOR;
    }
    public double getPLANE_ALTITUDE() {
        return PLANE_ALTITUDE;
    }

    public void setPLANE_ALTITUDE(double PLANE_ALTITUDE) {
        this.PLANE_ALTITUDE = PLANE_ALTITUDE;
    }

    public double getPLANE_LATITUDE() {
        return PLANE_LATITUDE;
    }

    public void setPLANE_LATITUDE(double PLANE_LATITUDE) {
        this.PLANE_LATITUDE = PLANE_LATITUDE;
    }

    public double getPLANE_LONGITUDE() {
        return PLANE_LONGITUDE;
    }

    public void setPLANE_LONGITUDE(double PLANE_LONGITUDE) {
        this.PLANE_LONGITUDE = PLANE_LONGITUDE;
    }

    public double getAirspeed_Indicated() {
        return Airspeed_Indicated;
    }

    public void setAirspeed_Indicated(double airspeed_Indicated) {
        Airspeed_Indicated = airspeed_Indicated;
    }

    public double getFLAPS_HANDLE_INDEX() {
        return FLAPS_HANDLE_INDEX;
    }

    public void setFLAPS_HANDLE_INDEX(double FLAPS_HANDLE_INDEX) {
        this.FLAPS_HANDLE_INDEX = FLAPS_HANDLE_INDEX;
    }

    public double getFLAP_POSITION_SET() {
        return FLAP_POSITION_SET;
    }

    public void setFLAP_POSITION_SET(double FLAP_POSITION_SET) {
        this.FLAP_POSITION_SET = FLAP_POSITION_SET;
    }

    public double getAMBIENT_PRECIP_RATE() {
        return AMBIENT_PRECIP_RATE;
    }

    public void setAMBIENT_PRECIP_RATE(double AMBIENT_PRECIP_RATE) {
        this.AMBIENT_PRECIP_RATE = AMBIENT_PRECIP_RATE;
    }

    public double getAMBIENT_WIND_DIRECTION() {
        return AMBIENT_WIND_DIRECTION;
    }

    public void setAMBIENT_WIND_DIRECTION(double AMBIENT_WIND_DIRECTION) {
        this.AMBIENT_WIND_DIRECTION = AMBIENT_WIND_DIRECTION;
    }

    public double getAMBIENT_WIND_VELOCITY() {
        return AMBIENT_WIND_VELOCITY;
    }

    public void setAMBIENT_WIND_VELOCITY(double AMBIENT_WIND_VELOCITY) {
        this.AMBIENT_WIND_VELOCITY = AMBIENT_WIND_VELOCITY;
    }

    public double getLIGHT_NAV() {
        return LIGHT_NAV;
    }

    public void setLIGHT_NAV(double LIGHT_NAV) {
        this.LIGHT_NAV = LIGHT_NAV;
    }

    public int getGEAR_POSITION() {
        return GEAR_POSITION;
    }

    public void setGEAR_POSITION(int GEAR_POSITION) {
        this.GEAR_POSITION = GEAR_POSITION;
    }

/*    0 = 混凝土
1 = 草
2 = 水
3 = Grass_bumpy
4 = 沥青
5 = Short_grass
6 = Long_grass
7 = Hard_turf
8 = 雪
9 = 冰
10 = 城市
11 = 森林
12 = 泥土
13 = 珊瑚
14 = 砾石
15 = Oil_treated
16 = Steel_mats
17 = 沥青
18 = 砖
19 =碎石
20 = 木板
21 = 沙
22 = 页岩
23 = 柏油路面

24 = Wright_flyer_track*/
    int GEAR_POSITION;//:1

    int BRAKE_INDICATOR;

    double VERTICAL_SPEED;

    public double getVERTICAL_SPEED() {
        return VERTICAL_SPEED;
    }

    public void setVERTICAL_SPEED(double VERTICAL_SPEED) {
        this.VERTICAL_SPEED = VERTICAL_SPEED;
    }


    @Override
    public String toString() {
        return "VarResult{" +
                "PLANE_ALTITUDE=" + PLANE_ALTITUDE +
                ", PLANE_LATITUDE=" + PLANE_LATITUDE +
                ", PLANE_LONGITUDE=" + PLANE_LONGITUDE +
                ", PLANE_HEADING_DEGREES_GYRO=" + PLANE_HEADING_DEGREES_GYRO +
                ", Airspeed_Indicated=" + Airspeed_Indicated +
                ", FLAPS_HANDLE_INDEX=" + FLAPS_HANDLE_INDEX +
                ", FLAP_POSITION_SET=" + FLAP_POSITION_SET +
                ", AMBIENT_PRECIP_RATE=" + AMBIENT_PRECIP_RATE +
                ", AMBIENT_WIND_DIRECTION=" + AMBIENT_WIND_DIRECTION +
                ", AMBIENT_WIND_VELOCITY=" + AMBIENT_WIND_VELOCITY +
                ", LIGHT_NAV=" + LIGHT_NAV +
                ", SURFACE_TYPE=" + SURFACE_TYPE +
                ", GEAR_POSITION=" + GEAR_POSITION +
                ", BRAKE_INDICATOR=" + BRAKE_INDICATOR +
                ", VERTICAL_SPEED=" + VERTICAL_SPEED +
                '}';
    }
}
