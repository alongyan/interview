package com.interview.jvm;

public class Test_Remainder {
    public static void main(String[] args) {
        //HashMap hm=new HashMap();
        //取模的位运算 参考 hashmap 取模位运算实现      待运算值 & (长度-1)
        //位运算 速度快
        System.out.println(1&(4-1));
        System.out.println(6&(4-1));
        System.out.println(7&(4-1));
        System.out.println(8&(4-1));
        System.out.println(2021&(4-1));

    }
}
