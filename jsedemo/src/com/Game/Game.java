package com.Game;

import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Test1[] uarr =new Test1[10];
        Test2[] d= new Test2[36];

        System.out.println("请输入用户名：");
        System.out.println("请输入密码：");
        System.out.println("请输入生肖：");
        System.out.println("请输入出生月份：");
        System.out.println("请输入星座：");

        Test2 a=new Test2("生肖","鸡","苏");
        d[0]=a;
        Test2 a2=new Test2("生肖","马","顾");
        d[1]=a2;
        Test2 a3=new Test2("生肖","羊","夏");
        d[2]=a3;
        Test2 a4=new Test2("生肖","兔","陌");
        d[3]=a4;
        Test2 a5=new Test2("生肖","龙","夜");
        d[4]=a5;
        Test2 a6=new Test2("生肖","鼠","上官");
        d[5]=a6;
        Test2 a7=new Test2("生肖","猪","慕");
        d[6]=a7;
        Test2 a8=new Test2("生肖","猴","楚");
        d[7]=a8;
        Test2 a9=new Test2("生肖","蛇","陆");
        d[8]=a9;
        Test2 a10=new Test2("生肖","狗","程");
        d[9]=a10;
        Test2 a11=new Test2("生肖","牛","浴");
        d[10]=a11;
        Test2 a12=new Test2("生肖","虎","玉");
        d[11]=a12;
        Test2 a13=new Test2("月份","1","小");
        d[12]=a13;
        Test2 a14=new Test2("月份","2","棂");
        d[13]=a14;
        Test2 a15=new Test2("月份","3","玥");
        d[14]=a15;
        Test2 a16=new Test2("月份","4","浅");
        d[15]=a16;
        Test2 a17=new Test2("月份","5","瑾");
        d[16]=a17;
        Test2 a18=new Test2("月份","6","颜");
        d[17]=a18;
        Test2 a19=new Test2("月份","7","曦");
        d[18]=a19;
        Test2 a20=new Test2("月份","8","夭");
        d[19]=a20;
        Test2 a21=new Test2("月份","9","眠");
        d[20]=a21;
        Test2 a22=new Test2("月份","10","晴");
        d[21]=a22;
        Test2 a23=new Test2("月份","11","莹");
        d[22]=a23;
        Test2 a24=new Test2("月份","12","瑶");
        d[23]=a24;
        Test2 a25=new Test2("星座","白羊座","浅");
        d[24]=a25;
        Test2 a26=new Test2("星座","金牛座","姬");
        d[25]=a26;
        Test2 a27=new Test2("星座","巨蟹座","盈");
        d[26]=a27;
        Test2 a28=new Test2("星座","天蝎座","晞");
        d[27]=a28;
        Test2 a29=new Test2("星座","双子座","儿");
        d[28]=a29;
        Test2 a30=new Test2("星座","射手座","璃");
        d[29]=a30;
        Test2 a31=new Test2("星座","狮子座","衣");
        d[30]=a31;
        Test2 a32=new Test2("星座","处女座","仪");
        d[31]=a32;
        Test2 a33=new Test2("星座","天秤座","之");
        d[32]=a33;
        Test2 a34=new Test2("星座","双鱼座","绯");
        d[33]=a34;
        Test2 a35=new Test2("星座","水瓶座","色");
        d[34]=a35;
        Test2 a36=new Test2("星座","摩羯座","蓉");
        d[35]=a36;

        String uname = sc.next();
        int psd = sc.nextInt();
        String sx = sc.next();
        int month = sc.nextInt();
        String xz =sc.next();


        int m =register(uname, psd, sx, month, xz, uarr);
        if(m == 1){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }

        System.out.println("请登录");
        String uname2 = sc.next();
        int psd2 = sc.nextInt();
        int login =login(uname2,psd2,uarr);
        if(login == 1){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

        System.out.println("请输入生肖，月份，星座");
        String sx2 =sc.next();
        String mon =sc.next();
        String xz2 =sc.next();
        String newName = Go(sx2,mon,xz2,d);
        System.out.println("你前世的名字是："+newName);
    }
    //注册
    public static int register(String uname,int psd,String sx,int month,String xz,Test1[] ua){
        Test1 u =new Test1();
        u.uname =uname;
        u.psd = psd;
        u.sx = sx;
        u.month = month;
        u.xz = xz;
        for(int i = 0;i < ua.length;i++){
            if(ua[i] == null){
                ua[i] = u;
                return 1;
            }
        }
        return -1;
    }
    //登录
    public static int login(String uname,int psd,Test1[] ua){
        for(int i = 0;i < ua.length;i++){
            if(ua[i] !=null){
                if(ua[i].uname.equals(uname) && ua[i].psd == psd){
                    return 1;
                }
            }
        }
        return -1;
    }
    //开始测试
    public static String Go(String sx2,String mon,String xz2,Test2[] d){
        String newName="";

        for (int i = 0;i < d.length;i++){
            if (d[i] !=null){
                if(d[i].cate.equals("生肖")){
                    if (d[i].oz.equals(sx2)){
                        newName=newName+d[i].nz;
                    }
                }
                if(d[i].cate.equals(("月份"))){
                    if (d[i].oz.equals(mon)){
                        newName=newName+d[i].nz;
                    }
                }
                if (d[i].cate.equals("星座")){
                    if (d[i].oz.equals(xz2)){
                        newName=newName+d[i].nz;
                    }
                }
            }
        }
        return newName;
    }
}
