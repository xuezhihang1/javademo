package com.zhouce3;

public class Taxi extends Car {
    protected String company;  //所属公司


    public Taxi(String company) {
        super("蓝色","张小泉");
        this.company = company;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void ride() {
        System.out.println(userName+"出租车是所属于在" + company + "公司的");
    }

    public void use() {
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    public String toString(){
        System.out.println("Taxi的信息是:"+userName+"拥有一辆"+color+"的出租车");
        return null;
    }
}
