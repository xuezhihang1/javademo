package com.zhouce2;

import java.util.Scanner;
public class LingJing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DengJi[] arr = new DengJi[10];
        LingShou[] ls = new LingShou[10];


        //记录信息
        System.out.println("请记录你的名字：");
        String uname = sc.next();
        System.out.println("请记录你的门派：");
        String menpai = sc.next();
        System.out.println("请记录你的性别：");
        String xingbie = sc.next();
        System.out.println("请记录你的年龄：");
        int age = sc.nextInt();

        //登记
        int m = Record(uname, menpai, xingbie, age, arr);
        if (m == 1) {
            System.out.println("年龄符合，可以进入灵境");
            System.out.println("登记成功");
        } else {
            System.out.println("年龄不符合，不能进入灵境");
            System.out.println("登记失败");
            return;
        }
        //灵兽
        LingShou a = new LingShou();
        LingShou a2 = new LingShou();
        LingShou a3 = new LingShou();
        LingShou a4 = new LingShou();
        LingShou a5 = new LingShou();
        LingShou a6 = new LingShou();
        LingShou a7 = new LingShou();
        LingShou a8 = new LingShou();
        LingShou a9 = new LingShou();
        LingShou a10 = new LingShou();
        a.tp = "金";
        a.lsname = "裂空座";
        a.attribute = "飞空，龙";
        a.ability = "S级";
        a.grade = "50级";
        a.skill = "神速，龙之怒";
        a2.tp = "木";
        a2.lsname = "妙蛙花";
        a2.attribute = "草，地面";
        a2.ability = "A级";
        a2.grade = "36级";
        a2.skill = "藤蔓，阳光烈焰";
        a3.tp = "水";
        a3.lsname = "海皇牙";
        a3.attribute = "水";
        a3.ability = "S级";
        a3.grade = "50级";
        a3.skill = "大瀑布，绝对零度，高压水炮";
        a4.tp = "火";
        a4.lsname = "古拉顿";
        a4.attribute = "火，地面";
        a4.ability = "S级";
        a4.grade = "50级";
        a4.skill = "火山喷发，地裂，地震";
        a5.tp = "土";
        a5.lsname = "土神柱";
        a5.attribute = "土，地面";
        a5.ability = "S级";
        a5.grade = "50级";
        a5.skill = "落岩";
        a6.tp = "金";
        a6.lsname = "钢神柱";
        a6.attribute = "钢，金";
        a6.ability = "S级";
        a6.grade = "50级";
        a6.skill = "钢尾";
        a7.tp = "木";
        a7.lsname = "奇拉比";
        a7.attribute = "草，时间";
        a7.ability = "S级";
        a7.grade = "50级";
        a7.skill = "时光逆流";
        a8.tp = "水";
        a8.lsname = "水箭龟";
        a8.attribute = "水，地面";
        a8.ability = "A级";
        a8.grade = "36级";
        a8.skill = "火箭头槌";
        a9.tp = "火";
        a9.lsname = "喷火龙";
        a9.attribute = "火，飞空，龙";
        a9.ability = "A级";
        a9.grade = "36级";
        a9.skill = "大字爆，喷射火焰";
        a10.tp = "土";
        a10.lsname = "班吉拉斯";
        a10.attribute = "土，地面";
        a10.ability = "A级";
        a10.grade = "48级";
        a10.skill = "破坏死光";
        ls[0] = a;
        ls[1] = a2;
        ls[2] = a3;
        ls[3] = a4;
        ls[4] = a5;
        ls[5] = a6;
        ls[6] = a7;
        ls[7] = a8;
        ls[8] = a9;
        ls[9] = a10;
        System.out.println("请选择想要的灵兽：");
        for (int i = 0; i < ls.length; i++) {
            if (ls[i] != null) {
                System.out.println("灵兽编号：" + i + "灵兽名称：" + ls[i].lsname + "灵兽属性：" + ls[i].attribute +
                        "灵兽能力值：" + ls[i].ability + "灵兽等级：" + ls[i].grade + "灵兽技能：" + ls[i].skill);
            }
        }
        for (int l = 1; l == 1; ) {

//            选择灵兽
            System.out.println("请输入要选择的灵兽编号：");
            int n = sc.nextInt();
//        输出想要选择的灵兽
            if (n < ls.length && n >= 0) {
                System.out.println("灵兽编号：" + n + "灵兽名称：" + ls[n].lsname + "灵兽属性：" + ls[n].attribute +
                        "灵兽能力值：" + ls[n].ability + "灵兽等级：" + ls[n].grade + "灵兽技能：" + ls[n].skill);
            } else{
                System.out.println("你选择的灵兽不存在");
                System.out.println("请重新选择：");
                l = sc.nextInt();
            }
            System.out.println("必须回答我的问题，我才能跟你走！");
            System.out.println("要我跟你走吗？1代表需要，2代表不需要，请选择：");
            int bt = sc.nextInt();
            if(bt == 1){
                System.out.println("需要");
                System.out.println("我可以跟你走");
                System.out.println("离开灵境");
            return;
            } else{
                System.out.println("不需要");
                System.out.println("请输入0重新选择");
                bt = sc.nextInt();
            }
        }
    }

    //进入登记
    public static int Record(String uname, String menpai, String xingbie, int age, DengJi[] arr) {
        DengJi a = new DengJi();
        a.uname = uname;
        a.menpai = menpai;
        a.xingbie = xingbie;
        a.age = age;
        for (int i = 0; i < arr.length; i++) {
            if (age < 18 || age > 30) {
                return -1;
            } else if (arr[i] != null) {
                arr[i] = a;
            }
        }
        return 1;
    }
}

