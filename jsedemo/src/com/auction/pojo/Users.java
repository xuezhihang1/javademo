package com.auction.pojo;

public class Users {
    private String uname;
    private String password;
    private int capital = 0;

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getUname(){
        return uname;
    }
    public void setUname(String uname){
        this.uname = uname;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
