package com.example.administrator.cxweather.db;

/*
 * 实体类
 * 市
 * litepal中的每一个实体类都需要继承DataSupport类
 * */
import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private String cityName;//市的名称
    private int cityCode;//市的代号
    private int provinceId;//所属省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
