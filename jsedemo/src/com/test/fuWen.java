package com.test;

import java.util.ArrayList;
import java.util.List;

public class fuWen {
    public  String name;
    public String coler;
    public  String type;
    public String levle;

    public fuWen(String name, String coler, String type,String levle) {
        this.name = name;
        this.coler = coler;
        this.type = type;
        this.levle = levle;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevle() {
       return levle;
    }

    public void setLevle(String levle) {
        this.levle = levle;
    }

    //创建铭文数组
    public static List<ziFuWen> create(){

        List<ziFuWen> ziFuWens = new ArrayList<>();
//        String douzhi = "斗志";
//        String yonggan = "勇敢";
        for (int i=1; i < 30; i++) {
           ziFuWen ziFuWen = new ziFuWen("勇气","橙色","物理攻击","1");
//           ziFuWen ziFuWen2 = new ziFuWen("斗志","橙色","法术攻击","1");
//            if (i > 5) {
//                ziFuWen.setName(douzhi);
//                ziFuWen.setType("法术攻击");
//            }
//            if (i > 10) {
//                ziFuWen.setName(yonggan);
//                ziFuWen.setType("法术");
//            }
            ziFuWens.add(ziFuWen);
        }
        for (int i=30; i < 60; i++) {
            ziFuWen ziFuWen = new ziFuWen("符文"+i,"蓝色"+i,"攻击","2");
            ziFuWens.add(ziFuWen);
        }
        for (int i=60; i <93; i++) {
            ziFuWen ziFuWen = new ziFuWen("符文" + i, "绿色" + i, "攻击","3");
            ziFuWens.add(ziFuWen);
        }
        return ziFuWens;
    }
}
