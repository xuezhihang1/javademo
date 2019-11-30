package com.demo5;

public class Programmer extends Employee{
    public Programmer(){}

    public Programmer(String name,String id,int salary){
        super(name,id,salary);
    }
    public void work(){
        System.out.println("按照需求写代码");
    }
}
