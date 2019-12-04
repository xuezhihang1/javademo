package com.auction.dao;

import com.auction.pojo.Commodity;
import com.auction.pojo.Users;
import java.util.Scanner;


//数据层
public class UserDao {
    Scanner sc = new Scanner(System.in);
    //创建用户数据数组
    private static Users[] ue ;
    //创建钱包数组
    private static int [] wa ;
    //创建存放商品的数组
    private static Commodity[] cm;
    //创建百宝囊的数组
    private static Commodity []bag;
    //创建购物车的数组
    private static Commodity []car;

    private static int p;   //当前余额
    private static int p2;   //余额的和
    private static int n;

    static{
        ue = new Users[10];
        wa = new int[1];
        cm = new Commodity[15];
        bag = new Commodity[50];
        car = new Commodity[15];
        p = 0;
        n = 0;
    }
    //根据用户名查找用户
    public Users selectByUname(String uname){
        for(int i = 0;i < ue.length;i++){
            if(ue[i] != null){
                if(ue[i].getUname().equals(uname)){
                    return ue[i];
                }
            }
        }
        return null;
    }

    //往数组内放入新用户
    public int addOne(Users us){
        //遍历用户数组，找到空的位置，存放新的用户数据
        for(int i = 0;i < ue.length;i++){
            if (ue[i] == null){
                ue[i]  = us;
                return 1;
            }
        }
        return 0;
    }
    //判断用户是否存在
    public int login(String name,String psd){
        for (int j = 0;j <ue.length;j++ ){
            if (ue[j] !=null){
                if (ue[j].getUname().equals(name) && ue[j].getPassword().equals(psd)){
                    return 1;
                }
            }
        }
        return -1;
    }
    //往钱包数组中充值
    public int Recharge(int a){
        for (int i = 0;i < ue.length;i++){
            p2=ue[i].getCapital();
            p2=p2+a;
            ue[i].setCapital(p2);
            p = ue[i].getCapital();
            return p;
        }
        return -1;
    }

    //展示物品
    {
        Commodity dl = new Commodity(1,"无尽战刃","物理攻击，暴击","物理伤害",25,"唯一被动：+40%暴击效果");
        cm[0] = dl;
        Commodity dl2 = new Commodity(2,"破军","物理攻击","物理伤害",29,"唯一被动：对生命值低于50%的敌人造成额外30%的伤害");
        cm[1] = dl2;
        Commodity dl3 = new Commodity(3,"破晓","攻速，物理攻击，暴击","物理伤害",34,"唯一被动：+20%物理穿透，普通攻击伤害提升50点");
        cm[2] = dl3;
        Commodity dl4 = new Commodity(4,"末世","攻速，物理攻击，吸血","物理伤害",22,"唯一被动：普通攻击附带敌人当前生命值8%的物理伤害");
        cm[3] = dl4;
        Commodity dl5 = new Commodity(5,"回响之杖","法术攻击，移速","法术伤害",21,"唯一被动：技能命中会触发小范围爆炸造成100法术伤害，这个效果有5秒CD");
        cm[4] = dl5;
        Commodity dl6 = new Commodity(6,"辉月","法术攻击，冷却缩减","法术伤害",20,"唯一主动：90秒CD，免疫所有效果，不能移动、攻击和使用技能，持续1.5秒");
        cm[5] = dl6;
        Commodity dl7 = new Commodity(7,"虚无法杖","法术攻击，生命值","法术伤害",23,"唯一被动：+45%法术穿透");
        cm[6] = dl7;
        Commodity dl8 = new Commodity(8,"博学者之怒","法术攻击","法术伤害",26,"唯一被动：法术攻击提升35%");
        cm[7] = dl8;
        Commodity dl9 = new Commodity(9,"霸者重装","生命值，生命回复","防御",18,"唯一被动：脱离战斗后每秒恢复3%最大生命值");
        cm[8] = dl9;
        Commodity dl10 = new Commodity(10,"魔女斗篷","生命值，法术防御","防御",17,"唯一被动：脱离战斗3秒后获得一个吸收200点法术伤害的护盾");
        cm[9] = dl10;
        Commodity dl11 = new Commodity(11,"不祥征兆","生命值，物理防御","防御",16,"唯一被动：受到攻击会减少攻击者30%攻击速度与15%移动速度，持续3秒");
        cm[10] = dl11;
        Commodity dl12 = new Commodity(12,"贤者的庇护","物理防御，法术防御","防御",15,"唯一被动：死亡后2秒原地复活，并获得2000点生命值，冷却时间：150秒");
        cm[11] = dl12;
        Commodity dl13 = new Commodity(13,"近卫荣耀","生命值，移速","辅助",14,"唯一被动：提升周围800范围友军54点物理防御和法术防御");
        cm[12] = dl13;
        Commodity dl14 = new Commodity(14,"奔狼纹章","生命值，移速","辅助",13,"唯一主动：给自己和周围友军增加移速，3秒内会递增35%的移速，一共持续5秒，冷却时间：120秒");
        cm[13] = dl14;
        Commodity dl15 = new Commodity(15,"救赎之翼","生命值，移速","辅助",12,"唯一主动：立即为周围友军英雄提供一个吸收400点伤害的护盾，持续3秒，冷却时间：60秒");
        cm[14] = dl15;
    }
    public void Commodity(){
        for (int i = 0; i<cm.length; i++){
            System.out.println("名字："+cm[i].getName()+"属性："+cm[i].getAttribute()+"类型："+cm[i].getType()+"价格："+cm[i].getPrice()+"功能："+cm[i].getFunction());
        }
    }
    //搜索装备
    public void Search(){
        System.out.println("请输入你想要查找的装备的名字：");
        String m = sc.next();
        for (int i = 0;i <  cm.length;i++){
            if (cm[i] != null){
                if (m.equals(cm[i].name)){
                    System.out.println("装备名字为："+cm[i].name);
                    System.out.println("装备属性为："+cm[i].attribute);
                    System.out.println("装备类型为："+cm[i].type);
                    System.out.println("装备价格为："+cm[i].price);
                    System.out.println("装备功能为："+cm[i].function);
                    return;
                }
            }else{
                System.out.println("你输入的物品不存在");
                return;
            }
        }
    }
    //排行榜排序
    public void RankingList(){
        for (int i = 0;i < cm.length;i++){
            for (int j = 0;j < cm.length-1;j++){
                Commodity t;
                if(cm[j].getPrice() < cm[j+1].getPrice()){
                    t = cm[j];
                    cm[j] = cm[j+1];
                    cm[j+1] = t;
                }
            }
        }
    }
    //查看排行榜
    public void showRankingList(){
        for (int i = 0; i<cm.length; i++){
            System.out.println("名字："+cm[i].getName()+"属性："+cm[i].getAttribute()+"类型："+cm[i].getType()+"价格："+cm[i].getPrice()+"功能："+cm[i].getFunction());
        }
    }
    //展示全部商品信息
    public void showAll(){
        for (int i=0;i<cm.length;i++){
            if(cm[i]!=null){
                System.out.println("名字："+cm[i].getName()+"属性："+cm[i].getAttribute()+"类型："+cm[i].getType()+"价格："+cm[i].getPrice()+"功能："+cm[i].getFunction());
            }
        }
    }
    //展示百宝囊
    public void showTreasureBag(){
        for (int i = 0;i < bag.length;i++){
            if (bag[i] != null){
                System.out.println("名字："+bag[i].getName()+"属性："+bag[i].getAttribute()+"类型："+bag[i].getType()+"价格："+bag[i].getPrice()+"功能："+bag[i].getFunction());
            }
        }
    }
    //上架商品
    public void shelves(){
        if (wa[0]>500){
            for (int i = 0;i < bag.length;i++){
                if (bag[i] != null){
                    for (int j = 0;j < cm.length;j++){
                        if (cm[j] == null){
                            cm[j] = bag[i];
                            bag[i] = null;
                            break;
                        }
                    }
                }
            }
        }
    }
    //加入购物车
    public int shoppingCar(int l){
        for(int i=0;i<car.length;i++){
            for (int j=0;j<cm.length;j++){
                if(cm[j]!=null){
                    if(cm[j].getSerial()==l){
                        if(car[i]==null){
                            car[i]=cm[j];
                            cm[j]=null;
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }
    //展示购物车
    public int showCar(){
       for (int i = 0;i < car.length;i++){
           if (car[i] !=null){
               System.out.println("名字："+car[i].getName()+"属性："+car[i].getAttribute()+"类型："+car[i].getType()+"价格："+car[i].getPrice()+"功能："+car[i].getFunction());
           }
       }
       return 0;
    }
    //结算
    public int spend(){
       for (int i = 0;i < car.length;i++){
           if (car[i] !=null){
               n = n+car[i].getPrice();
               if (p >= n){
                   p = p -n;
                   System.out.println("当前余额为："+p);
                   for (int j = 0;j < car.length; j++){
                       if (car[i] != null){
                           for (int k = 0;k < bag.length;k++)
                               if (bag[k] == null){
                               bag[k] = car[j];
                               car[j] = null;
                               break;
                               }
                       }
                   }
                   return 1;
               }
               else{
                   System.out.println("余额不足，请先充值");
                   return 0;
               }
           }
       }
       return 0;
    }
}
