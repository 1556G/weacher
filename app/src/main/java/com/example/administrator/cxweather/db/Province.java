package com.example.administrator.cxweather.db;

/*
* 实体类
* 省
* litepal中的每一个实体类都需要继承DataSupport类
* */
import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id; //id
    private String provinceName; //省的名字
    private int provinceCode; //省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
