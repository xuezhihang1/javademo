package com.Practice;

import java.util.Scanner;
public class Test3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Water a=new Water();
        Water b=new Water();
        Water c=new Water();
        Water d=new Water();
        Water e=new Water();
        a.name ="矿泉水";
        a.price="2元";
        b.name ="可乐";
        b.price="3元";
        c.name ="脉动";
        c.price="4元";
        d.name ="咖啡";
        d.price="5元";
        e.name ="红牛";
        e.price="6元";
        Water[] arr =new Water[5];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;
        System.out.println("=============");
        System.out.println("欢迎使用无人自助售货机");
        System.out.println("请选购以下商品：");
        for (int i = 0;i<arr.length;i++){
            if(arr[i] !=null){
                System.out.println("商品编号："+i+"商品名称："+arr[i].name+"商品价格："+arr[i].price);
            }
        }
        for (int k=1;k==1;){
//            客户选购商品
            System.out.println("请选择要购买的商品编号：");
            int m=sc.nextInt();
//        输出顾客想要购买的商品
            if(m<arr.length && m>=0){
                System.out.println("商品编号："+m+"商品名称："+arr[m].name+"商品价格："+arr[m].price);
            }else{
                System.out.println("您想购买的商品"+m+"不存在！");
            }
            System.out.println("是否继续购买？1代表是，0代表否，请输入：");
            k=sc.nextInt();
        }
    }
}
