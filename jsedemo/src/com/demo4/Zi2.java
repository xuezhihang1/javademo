package com.demo4;

public class Zi2 extends Fu2{
    static{
        System.out.println("静态代码块Zi");
    }
    {
        System.out.println("构造代码块Zi");
    }
    public Zi2(){
        System.out.println("构造方法Zi");
    }
}
