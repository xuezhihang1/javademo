package com.demo6.student1;

public class StudentTest {
    public static void main(String[] args){
        StudentTest s1 = new StudentTest();
        System.out.println(s1.hashCode());
        StudentTest s2 = new StudentTest();
        System.out.println(s2.hashCode());
        StudentTest s3 = s1;
        System.out.println(s3.hashCode());
        System.out.println("------------");

        StudentTest s = new StudentTest();
        Class c= s.getClass();
        String str = c.getName();
        System.out.println(str);

        String str2 = s.getClass().getName();
        System.out.println(str2);
    }
}
