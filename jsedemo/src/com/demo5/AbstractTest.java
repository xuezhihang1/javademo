package com.demo5;

public class AbstractTest {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.setName("旺财");
        d.setAge(3);
        System.out.println(d.getName()+"-------"+d.getAge());
        d.eat();
        Dog d2 = new Dog("旺财",3);
        System.out.println(d2.getName()+"-------"+d2.getAge());
        d2.eat();
        System.out.println("----------------------");
        Animal a = new Dog();
        a.setName("旺财");
        a.setAge(3);
        System.out.println(a.getName()+"-------"+a.getAge());
        a.eat();
        Animal a2 = new Dog("旺财",3);
        System.out.println(a2.getName()+"-------"+a2.getAge());
        a2.eat();
    }
}
