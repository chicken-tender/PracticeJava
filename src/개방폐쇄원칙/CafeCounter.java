package 개방폐쇄원칙;

public class CafeCounter {
    public static void main(String[] args) {
        HeadOffice starbucks = new Franchisee();
        starbucks.order();
        starbucks.make();
    }
}
