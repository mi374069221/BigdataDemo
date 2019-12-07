package com.qm.pojo;

public class WeatherWindDireBean {
    private String nowWeather;
    private String nowWindDire;

    public WeatherWindDireBean() {
    }

    public WeatherWindDireBean(String nowWeather, String nowWindDire) {
        this.nowWeather = nowWeather;
        this.nowWindDire = nowWindDire;
    }

    public String getNowWeather() {
        return nowWeather;
    }

    public void setNowWeather(String nowWeather) {
        this.nowWeather = nowWeather;
    }

    public String getNowWindDire() {
        return nowWindDire;
    }

    public void setNowWindDire(String nowWindDire) {
        this.nowWindDire = nowWindDire;
    }
}
