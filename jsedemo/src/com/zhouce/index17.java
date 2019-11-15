package com.zhouce;

public class index17 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%3 !=0){
                sum=sum+1;
            }
        }
        System.out.println("1到100之间不能被3整除的数之和为："+sum);
    }
}
