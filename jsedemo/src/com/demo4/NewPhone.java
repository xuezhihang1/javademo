package com.demo4;

public class NewPhone extends Phone{
    public void call(String name){
        super.call(name);
        System.out.println("可以听天气预报了");
    }
}
