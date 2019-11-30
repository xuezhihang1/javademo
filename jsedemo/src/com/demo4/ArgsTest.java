package com.demo4;

public class ArgsTest {
    public static void main(String[] args) {
        Demo d = new Demo();
        int result = d.sum(10,20);
        System.out.println("result"+result);
        System.out.println("---------------");
        StudentDemo2 sd = new StudentDemo2();
        Student s1 = new Student();
        sd.method(s1);
    }
}
