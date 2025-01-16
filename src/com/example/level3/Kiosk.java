import java.util.List;
import java.util.Scanner;

   public class Kiosk {
    private List<MenuItem> menuItems; // 메뉴 리스트
    private Scanner scanner;          // 사용자 입력 처리

    // 생성자: 메뉴 리스트 초기화
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.scanner = new Scanner(System.in);
    }

    // 프로그램 실행 메서드
    public void start() {
        while (true) {
            printMenu(); // 메뉴 출력
            int choice = getUserInput(); // 사용자 입력 받기

            if (choice == 0) { // 종료 조건
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice > 0 && choice <= menuItems.size()) { // 유효한 선택
                MenuItem selectedItem = menuItems.get(choice - 1);
                System.out.println(selectedItem.getName() + "를 주문하셨습니다.");
            } else { // 잘못된 입력
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }

    private void printMenu() {
        System.out.println("[ SHAKESHACK MENU ]");;
        for(int i =0; i < menuItems.size(); i++){
            System.out.println(i + 1 + ". " + menuItems.get(i));
        }
        scanner.close("0 종료  |종료";
    }


    private int getUserInput() {
        System.out.println("메뉴를 선택하세요");
        while(scanner.hasNextInt()){
            System.out.println("유효한 숫자를 입력하세요");
            scanner.nextLine();

            return scanner.nextInt();
        }
    }




}



