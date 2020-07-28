package com.interview.jvm;

public class Test1 {


    public static void main(String[] args) {
        String a="abc";
        for(int i=0;i<100000;i++){
            a+=i;
        }
        System.out.printf("222::"+a);
    }


}
