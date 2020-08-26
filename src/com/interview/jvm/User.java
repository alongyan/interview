package com.interview.jvm;

public class User {
    private int id;
    private String name;
    private char [] desc= new char[1024*100];

    public User(int id, char[] desc) {
        this.id = id;
        this.desc = desc;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char[] getDesc() {
        return desc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(char[] desc) {
        this.desc = desc;
    }
}
