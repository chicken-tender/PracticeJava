package 개방폐쇄원칙;

import java.util.Scanner;

public class HeadOffice implements Makeable {
    String menu;

    public String order() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주문할 메뉴를 입력하세요. : ");
        menu = sc.next();
        return menu;
    }

    @Override
    public void make() {
        System.out.println(menu + "를 만듭니다.");
    }
}
