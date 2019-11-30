package com.demo4;

public class Student4 {
    String name;
    int age;
    public void setAge(int a){
        if(a < 0 || a > 120){
            System.out.println("你给的年龄有问题");
        }else {
            age = a ;
        }
    }
    public void show4(){
        System.out.println("姓名"+name);
        System.out.println("年龄"+age);
    }
}
