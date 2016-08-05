package ru.consort.sensor.entities;


/**
 * Created by DaH4uk on 04.08.2016.
 * This is a Parameter Entity
 */
public class Parameter {
    private String parameterName;
    private Integer parameterValue;

    public Parameter(String parameterName, Integer parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    public Parameter() {
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public Integer getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(Integer parameterValue) {
        this.parameterValue = parameterValue;
    }
}
