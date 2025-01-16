package com.example.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseburger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        List<MenuItem> menuItemList = new ArrayList<>(
                List.of(shackBurger, smokeShack, cheeseburger, hamburger)
        );

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItemList.size(); i++) {
                MenuItem menuItem = menuItemList.get(i);
                System.out.println(i + 1 + ". " + menuItem.getName() + "   | W " + menuItem.getPrice() + " | " + menuItem.getDescription());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println("메뉴를 선택하세요.");

            int i = sc.nextInt();

            if (i == 1) {
                MenuItem menuItem = menuItemList.get(0);
                System.out.println(menuItem.getName() + "   | W " + menuItem.getPrice() + " | " + menuItem.getDescription() + "를 주문했습니다.");
            } else if (i == 2) {
                MenuItem menuItem = menuItemList.get(1);
                System.out.println(menuItem.getName() + "   | W " + menuItem.getPrice() + " | " + menuItem.getDescription() + "를 주문했습니다.");
            } else if (i == 3) {
                MenuItem menuItem = menuItemList.get(2);
                System.out.println(menuItem.getName() + "   | W " + menuItem.getPrice() + " | " + menuItem.getDescription() + "를 주문했습니다.");
            } else if (i == 4) {
                MenuItem menuItem = menuItemList.get(3);
                System.out.println(menuItem.getName() + "   | W " + menuItem.getPrice() + " | " + menuItem.getDescription() + "를 주문했습니다.");
            } else if (i == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
