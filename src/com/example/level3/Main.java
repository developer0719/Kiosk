package com.example.level3;

import com.example.level1.Kiosk;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //메뉴 리스트 초기화
        List<MenuItem> menuItems = new ArrayList<MenuItem>();
        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseburger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        //키오스크 객체 생성 및 실행
        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();

    }
}
