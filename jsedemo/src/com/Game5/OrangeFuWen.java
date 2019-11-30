package com.Game5;

public class OrangeFuWen extends FuWen {
    private int adHurt;      //物理攻击
    private int apHurt;      //法术攻击
    private String adSpeed;  //攻速
    static final String color= "橙色";

    public OrangeFuWen(){

    }

    public int getAdHurt(){
        return adHurt;
    }
    public void setAdHurt(int adHurt){
        this.adHurt = adHurt;
    }
    public int getApHurt(){
        return apHurt;
    }
    public void setApHurt(int apHurt){
        this.apHurt = apHurt;
    }
    public String getAdSpeed(){
        return adSpeed;
    }
    public void setAdSpeed(String adSpeed){
        this.adSpeed = adSpeed;
    }

}
