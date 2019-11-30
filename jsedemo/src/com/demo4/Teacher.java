package com.demo4;

public class Teacher {
    public int num = 10;
    public static int num2 = 20;

    public void show5(){
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(num2);
    }

    public static void method3(){
//        System.out.println(num);
        System.out.println(num2);
//        function();
        function2();
    }
    public void function(){}
    public static void function2(){}
}
