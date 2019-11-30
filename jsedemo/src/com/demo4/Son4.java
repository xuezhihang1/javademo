package com.demo4;

public class Son4 extends Father4{
    public Son4(){
        super("随便给");
        System.out.println("Son的无参构造方法");
    }

    public Son4(String name){
        this();
        System.out.println("Son的带参构造方法");
    }
}
