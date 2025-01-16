package com.example.level4;

import java.util.ArrayList;

public class Menu {
    // MenuItem 클래스를 List로 관리
        private String menuName;
        private List<MenuItem> menuItems;


    public Menu(String menuName){
        this.menuName = menuName;
        this.menuItems = new ArrayList<MenuItem>();
    }
