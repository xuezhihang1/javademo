package com.demo5;

public class Son extends Object implements Father,Mother{
    @Override
    public void show() {
        System.out.println("show son");
    }

    @Override
    public void show2() {
        System.out.println("show2 son");
    }
}
