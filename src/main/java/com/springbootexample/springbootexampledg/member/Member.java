package com.springbootexample.springbootexampledg.member;

public class Member {
    private int id;
    private String email;
    private String password;
    private String name;
    private int age;

    public Member(int id, String email, String password, String name, int age) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.age = age;
    }
}
