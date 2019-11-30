package com.demo4;

public class Son3 extends Father3{
    public int num = 20;

    public  void show9(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
