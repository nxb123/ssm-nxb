package com.jk.model;

import java.io.Serializable;

/**
 * Created by 微星 on 2018/5/8.
 */
public class Shop implements Serializable{


    private static final long serialVersionUID = -9005120204365134818L;
    private Integer shopid;
    private String shopname;


    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopid=" + shopid +
                ", shopname='" + shopname + '\'' +
                '}';
    }
}
