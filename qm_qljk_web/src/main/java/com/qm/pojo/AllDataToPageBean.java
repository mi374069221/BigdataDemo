package com.qm.pojo;

public class AllDataToPageBean {
    private String[] temperatureValues;
    private String[] windSpeedValues;
    private String[] windDirectionValues;
    private String[] frequencyValues;
    private String[] waterLevelValues;

    public AllDataToPageBean() {
    }

    public AllDataToPageBean(String[] temperatureValues, String[] windSpeedValues, String[] windDirectionValues, String[] frequencyValues, String[] waterLevelVaalues) {
        this.temperatureValues = temperatureValues;
        this.windSpeedValues = windSpeedValues;
        this.windDirectionValues = windDirectionValues;
        this.frequencyValues = frequencyValues;
        this.waterLevelValues = waterLevelVaalues;
    }

    public String[] getTemperatureValues() {
        return temperatureValues;
    }

    public void setTemperatureValues(String[] temperatureValues) {
        this.temperatureValues = temperatureValues;
    }

    public String[] getWindSpeedValues() {
        return windSpeedValues;
    }

    public void setWindSpeedValues(String[] windSpeedValues) {
        this.windSpeedValues = windSpeedValues;
    }

    public String[] getWindDirectionValues() {
        return windDirectionValues;
    }

    public void setWindDirectionValues(String[] windDirectionValues) {
        this.windDirectionValues = windDirectionValues;
    }

    public String[] getFrequencyValues() {
        return frequencyValues;
    }

    public void setFrequencyValues(String[] frequencyValues) {
        this.frequencyValues = frequencyValues;
    }

    public String[] getWaterLevelValues() {
        return waterLevelValues;
    }

    public void setWaterLevelValues(String[] waterLevelValues) {
        this.waterLevelValues = waterLevelValues;
    }
}