package com.demo4;

public class Fu2 {
    static{
        System.out.println("静态代码块Fu");
    }
    {
        System.out.println("构造代码块Fu");
    }
    public Fu2(){
        System.out.println("构造方法Fu");
    }
}
