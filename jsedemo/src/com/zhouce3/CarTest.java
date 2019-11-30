package com.zhouce3;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("蓝色","张");
        Car c2 = new Car("蓝色","张");
        c1.use();
        System.out.println("car1和car2的引用比较："+c1.equals(c2));
        System.out.println("=====================================");
        Taxi t = new Taxi("长生");
        t.ride();
        t.use();
        t.toString();
        System.out.println("======================================");
        HomeCar h = new HomeCar(7);
        h.display();
        h.display(5);
    }
}
