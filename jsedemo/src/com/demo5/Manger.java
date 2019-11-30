package com.demo5;

public class Manger extends Employee{
    private int money;

    public Manger(){}

    public Manger(String name,String id,int salary,int money){
        super(name,id,salary);
        this.money = money;
    }
    public void work(){
        System.out.println("跟客户谈需求");
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){this.money = money;}
}
