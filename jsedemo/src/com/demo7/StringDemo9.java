package com.demo7;

public class StringDemo9 {
    public static void main(String[] args) {
        String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String minString = "java";
        int count = getCount(maxString,minString);
        System.out.println("Java在大串中出现了："+count+"次");
    }
    public static int getCount(String maxString,String minString){
        int count = 0;

        int index = maxString.indexOf(minString);
        while(index != -1){
            count++;
            int startIndex = index+minString.length();
            maxString = maxString.substring(startIndex);
            index = maxString.indexOf(minString);
        }
        return count;
    }
}
