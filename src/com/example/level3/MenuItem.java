package com.example.level3;

public class MenuItem {

    //1. 속성
    private String name;
    private int price;
    private int description;

    //2. 생성자
    public MenuItem(String name, int price, int description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //3. 기능
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getDescription(){
        return description;
    }

}
