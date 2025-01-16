package com.example.level4;

import java.util.Scanner;

public class Kiosk {
private List<Menu> menuList;
public Kiosk() {List<Menu> menulist) {this.menuList = menulist;}
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            // 1. 메뉴
            MenuCommand menuCommand = handleMenuSelect(scanner);
            if (menuCommand.getCommand().equals("exit")) {
                break;
            }
            if (menuCommand.getCommand().equals("retry")) {
                continue;
            }
            Menu selectedMenu = menuCommand.getSelectedMenu();

            // 2. 아이템
            MenuItemCommand menuItemCommand = handleMenuItemSelect(scanner, selectedMenu);
            if (menuItemCommand.getCommand().equals("retry")) {
                continue;
            }
            MenuItem selectedMenuItem = menuItemCommand.getSelectedMenuItem();

        }
        scanner.close();
    }
}
