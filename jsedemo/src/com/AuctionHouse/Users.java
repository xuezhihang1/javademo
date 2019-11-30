package com.AuctionHouse;

public class Users {
     private String uname;
     private String password;

    public Users(){

    }
     public Users(String uname,String password){
        this.uname = uname;
        this.password = password;
    }
    public String getUname(){
        return this.uname;
    }
    public void setUname(String name){
        this.uname = name;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String psd){
        this.password = psd;
    }
}
