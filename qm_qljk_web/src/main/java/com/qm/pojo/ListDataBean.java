package com.qm.pojo;

public class ListDataBean {
    private String maxTemperature;
    private String minTemperature;
    private String maxWindSpeed;
    private String minWindSpeed;

    public ListDataBean() {
    }

    public ListDataBean(String maxTemperature, String minTemperature, String maxWindSpeed, String minWindSpeed) {
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.maxWindSpeed = maxWindSpeed;
        this.minWindSpeed = minWindSpeed;
    }

    public String getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(String maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public String getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(String minTemperature) {
        this.minTemperature = minTemperature;
    }

    public String getMaxWindSpeed() {
        return maxWindSpeed;
    }

    public void setMaxWindSpeed(String maxWindSpeed) {
        this.maxWindSpeed = maxWindSpeed;
    }

    public String getMinWindSpeed() {
        return minWindSpeed;
    }

    public void setMinWindSpeed(String minWindSpeed) {
        this.minWindSpeed = minWindSpeed;
    }
}
