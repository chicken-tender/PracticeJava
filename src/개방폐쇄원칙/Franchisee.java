package 개방폐쇄원칙;

import java.util.Scanner;

public class Franchisee extends HeadOffice implements Makeable {

    @Override
    public void make() {
        System.out.println(menu + "를 주문받았습니다.");
        System.out.println(menu + "를 만듭니다.");
    }
}
