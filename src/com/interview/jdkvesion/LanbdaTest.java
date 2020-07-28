package com.interview.jdkvesion;

public class LanbdaTest {

    public static void call(TestInterface testInterface){
        testInterface.outPut();
    }

    public static void main(String[] args) {
        //jdk 8 新特性 lanbda 表达式
        //传递实现类
        call(new TestInterfaceImpl());
        //匿名内部类
        call(new TestInterface() {
            @Override
            public void outPut() {
                System.out.println("匿名内部类调用");
            }
        });
        //lanbda表达式 【参数列表，箭头，声明语句三部分组成】
        call(()->{
            System.out.println("lanbda调用");
        });
        //当lanbda表达式只包含一条语句时，可以省略大括号，return和语句结尾的分号
        call(()-> System.out.println("lanbda简化调用"));
    }
}
