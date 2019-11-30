package com.demo5;

public class AbstractTest2 {
    public static void main(String[] args) {
        Employee emp = new Programmer();
        emp.setName("小白");
        emp.setId("czbk001");
        emp.setSalary(18000);
        System.out.println(emp.getName()+"-----"+emp.getId()+"-----"+emp.getSalary());
        emp.work();
        System.out.println("---------");

        Manger m = new Manger();
        m.setName("小蓝");
        m.setId("czbk002");
        m.setSalary(8000);
        m.setMoney(2000);
        System.out.println(m.getName()+"-----"+m.getId()+"-----"+m.getSalary());
        m.work();
        System.out.println("----------");

        m = new Manger("小紫","czbk002",8000,2000);
        System.out.println(m.getName()+"-----"+m.getId()+"-----"+m.getSalary());
        m.work();
    }
}
