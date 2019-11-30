package com.Game3;
import javax.jws.soap.SOAPBinding;
import java.util.Random;
import java.util.Scanner;
public class MingWenTest {
    private static int peopleIndex;
    private static int tempPeopleIndex;
    public static void main(String[] args)
    {
        OrangeMingWen orIns[]=new OrangeMingWen[31];
        BlueMingWen bluIns[]=new BlueMingWen[32];
        GreenMingWen greIns[]=new GreenMingWen[31];
        Users user[]=new Users[20];

        Scanner sc=new Scanner(System.in);
        initInscription(orIns,bluIns,greIns);
        int k;
        while (true)
        {
            Welcome();
            System.out.print("登陆请输入1，注册请输入2：");
            while (true)
            {
                k=sc.nextInt();
                if(k==1)
                {
                    if(login(user,sc)==1)
                    {
                        break;
                    }
                    else
                    {
                        return;
                    }
                }
                else if(k==2)
                {
                    Register(user,sc);
                    System.out.print("请登陆:");
                    if(login(user,sc)==1)
                    {
                        break;
                    }
                    else
                    {
                        return;
                    }
                }
                else
                {
                    System.out.print("您输入有误！请重新输入:");
                }
            }
            printWel2(user,sc);
            user[tempPeopleIndex].choiceIns(sc,orIns,bluIns,greIns);
            System.out.println("是否继续？按1继续，任意键(除1之外)退出");
            k=sc.nextInt();
            if(k==1)
            {
                continue;
            }
            else
            {
                return;
            }
        }
    }
    public static void initInscription(OrangeMingWen orIns[],BlueMingWen bluIns[],GreenMingWen greIns[])
    {
        int a[]=new int[31];
        int b[]=new int[32];
        String orInsName[]={
                "勇气","斗志","猛攻","白刃","痛苦","践踏","震击","拯救","致命","恐惧","信念","振奋",
                "一闪","暴戾","荆棘","戒律","阳炎","衰败","风暴","惩戒","狂热","圣人","传承","异变",
                "纷争","梦魇","凶兆","宿命","红月","无双","祸源"
        };
        String bluInsName[]={
                "活力","治疗","疾行","刚毅","吸收","生长","愈合","强健","感应","绽放","神速","饮血",
                "转换","渴血","正义","气数","刹那","复苏","滋生","急救","吞噬","轮回","隐匿","生长",
                "长生","兽痕","冥想","调和","繁荣","狩猎","贪婪","夺萃"
        };
        String greInsName[]={
                "应激","穿刺","专注","坚壁","幻盾","破甲","洞察","风怒","崩坏","突进","收割","贯穿",
                "破魔","侵蚀","庇护","潜能","野性","铁躯","无畏","憎恶","奇袭","献祭","鹰眼","虚空",
                "霸者","均衡","灵山","敬畏","回声","怜悯","心眼"
        };
        Random rand=new Random();
        int c1,c2;
        for(int i=0;i<orIns.length;)
        {
            c1=rand.nextInt(31)+0;
            if(a[c1]!=0)
            {
                continue;
            }
            else
            {
                a[c1]=1;
                orIns[i]=new OrangeMingWen();
                greIns[i]=new GreenMingWen();
                orIns[i].oraGetInfo(orInsName[c1]);
                greIns[i].greGetInfo(greInsName[c1]);
                i++;
            }
        }
        for(int i=0;i<bluIns.length;)
        {
            c2=rand.nextInt(32)+0;
            if(b[c2]!=0)
            {
                continue;
            }
            else
            {
                b[c2]=1;
                bluIns[i]=new BlueMingWen();
                bluIns[i].bluGetInfo(bluInsName[c2]);
                i++;
            }
        }
    }
    public static void Welcome()
    {
        System.out.println("欢迎来到符文大陆");
    }
    public static int login(Users[] user,Scanner sc)
    {
        String users;
        String password;
        while (true)
        {
            System.out.print("请输入账号：");
            users = sc.next();
            for (int i = 0; i < peopleIndex; i++) {
                if (users.equals(user[i].getAccount())) {
                    while (true) {
                        System.out.print("请输入密码：");
                        password = sc.next();
                        if (password.equals(user[i].getPasswd())) {
                            tempPeopleIndex=i;
                            System.out.println("login Success!");
                            return 1;
                        } else {
                            System.out.println("password Error!");
                        }
                    }
                }
            }
            System.out.println("该账号不存在!");
            System.out.println("是否继续登陆？继续请按1，退出请按2");
            int key;
            while (true) {
                key = sc.nextInt();
                if (key == 2) return 0;
                else if(key==1)break;
                else
                {
                    System.out.print("您输入有误！请重新输入:");
                }
            }
        }
    }
    public static void Register(Users user[],Scanner sc)
    {
        if(peopleIndex==user.length)
        {
            System.out.println("服务器人数已满，无法注册!");
            System.exit(0);
        }
        String account;
        String passwd;
        int i;
        while(true)
        {
            System.out.println("请输入用户名:");
            account=sc.next();
            for(i=0;i<peopleIndex;i++)
            {
                if(account.equals(user[i].getAccount()))
                {
                    System.out.println("用户名重复，请重新输入:");
                    break;
                }
            }
            if(i==peopleIndex) //用户名合法
            {
                System.out.println("请输入密码:");
                passwd=sc.next();
                tempPeopleIndex=peopleIndex;
                user[peopleIndex++]=new Users(account,passwd);
                System.out.println("Success!");
                break;
            }
        }
    }
    public static void printWel2(Users[] users,Scanner sc)
    {
        System.out.println("======================");
        System.out.println("欢迎来到铭文装备系统");
        System.out.println("======================");
        if(users[tempPeopleIndex].getOraNum()==0)
        {
            System.out.println("您当前橙色铭文数量为:0");
            System.out.println("您当前蓝色铭文数量为:0");
            System.out.println("您当前绿色铭文数量为:0");
        }
        else
        {
            System.out.println("您当前橙色铭文数量为:10");
            System.out.println("您当前蓝色铭文数量为:10");
            System.out.println("您当前绿色铭文数量为:10");
            System.out.println("====================================================");
            System.out.println("所选择铭文详情:");
            users[tempPeopleIndex].showTempAll();
            System.out.println("您现在不能对铭文进行操作!按1退出");
            int k;
            while (true)
            {
                k=sc.nextInt();
                if(k==1)
                {
                    System.exit(0);
                }
                else
                {
                    System.out.print("输入有误,重新输入:");
                }
            }
        }
    }
}

