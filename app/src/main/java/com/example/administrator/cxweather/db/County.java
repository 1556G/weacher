package com.example.administrator.cxweather.db;

import org.litepal.crud.DataSupport;
/*
 * 实体类
 * 县
 * litepal中的每一个实体类都需要继承DataSupport类
 * */
public class County extends DataSupport {
    private int id;
    private String countyName;//县的名称
    private String weatherId;//对应天气id
    private int cityId;//所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
