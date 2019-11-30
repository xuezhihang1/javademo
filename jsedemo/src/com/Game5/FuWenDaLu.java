package com.Game5;

import java.util.Scanner;
public class FuWenDaLu {
    public static void main(String[] args){
        //初始化
        //创建储存符文的数组
        FuWen[] fw= new FuWen[93];

        //放入三个不同的子类对象
        FuWen a = new OrangeFuWen();
        FuWen a1 = new GreenFuWen();
        FuWen a2 = new BlueFuWen();
    }
}
