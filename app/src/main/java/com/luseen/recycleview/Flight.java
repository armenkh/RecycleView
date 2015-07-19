package com.luseen.recycleview;

/**
 * Created by armkha01 on 19/07/2015.
 */
public class Flight {

    private String airportOfOrigin;
    private String code;
    private String flightNo;

    public Flight(String airportOfOrigin, String code, String flightNo) {
        this.airportOfOrigin = airportOfOrigin;
        this.code = code;
        this.flightNo = flightNo;
    }

    public String getAirportOfOrigin() {
        return airportOfOrigin;
    }

    public String getCode() {
        return code;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setAirportOfOrigin(String airportOfOrigin) {
        this.airportOfOrigin = airportOfOrigin;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getIconeName() {
        return code.toLowerCase();
    }
}
