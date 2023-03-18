package 팩토리얼;

public class Main {
    public static void main(String[] args) {
        System.out.println("3! = " + factorial(3));

    }
    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else return n * factorial(n-1);
    }
}
