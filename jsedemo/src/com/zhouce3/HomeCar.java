package com.zhouce3;

public class HomeCar extends Car {
    private int num;

    public HomeCar(int num) {
        super("紫色","孙二娘");
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public void display(){
        System.out.println(userName+"拥有的"+color+"的私家车，有"+num+"座位");
    }
    public void display(int num){
        System.out.println("家用汽车大多有"+num+"个座位");
    }
}
