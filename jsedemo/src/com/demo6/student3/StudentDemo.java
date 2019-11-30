package com.demo6.student3;

public class StudentDemo {
    public StudentDemo(String name, int age) {
    }

    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo("洛璃",27);
        StudentDemo s2 = new StudentDemo("洛璃",27);
        System.out.println(s1 == s2);
        StudentDemo s3 = s1;
        System.out.println(s1 == s3);
        System.out.println("---------------------");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s3));
        StudentDemo s4 = new StudentDemo("秋明",30);
        System.out.println(s1.equals(s4));

        Demo d = new Demo();
        System.out.println(s1.equals(d));
    }
}
class Demo{}
