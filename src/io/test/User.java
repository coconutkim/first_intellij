package io.test;

public class User {
    String name;
    int age;
    String phone;

    public User(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getUserInfo(){
        return "name: "+name+" | age: "+age+" | phone: "+phone;
    }
}
