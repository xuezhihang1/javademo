package com.demo4;

public class StudentDemo4 {
    public static void main(String[] args) {
        Student4 s = new Student4();
        s.show4();
        System.out.println("----------");
        s.name = "小白";
        s.age = 27;
        s.setAge(27);
        s.show4();
        System.out.println("----------");
        s.age = -27;
        s.setAge(-27);
        s.show4();
        System.out.println("----------");
    }
}
