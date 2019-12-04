package com.demo7;

public class StringDemo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = "";
        s += "[";

        for (int x = 0;x < arr.length;x++){
            if (x == arr.length-1){
                s +=arr[x];
                s +="]";
            }else{
                s +=arr[x];
                s +=",";
            }
        }
        System.out.println("最终的字符串是："+s);
    }
}
