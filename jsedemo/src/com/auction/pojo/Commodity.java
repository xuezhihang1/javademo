package com.auction.pojo;

public class Commodity {
    public int serial;        //序号
    public String name;       //名字
    public String attribute;  //属性
    public String type;       //类型
    public int price;         //价格
    public String function;   //功能

    public Commodity(){

    }
    public Commodity(int serial,String name,String attribute,String type,int price,String function){
        this.serial = serial;
        this.name = name;
        this.attribute = attribute;
        this.type = type;
        this.price = price;
        this.function = function;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
