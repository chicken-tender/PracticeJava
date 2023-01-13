package 갤럭시탭만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class GalaxyTab {
    private int tapType; // 탭 유형 : S , A
    private int screenSize; // 화면 크기 : 12인치, 13인치, 14인치
    private int memory; // 용량 : 64GB, 128GB, 256GB
    private int color; // 색상 : 그라파이트, 실버, 핑크골드
    private int network; // 네트워크 : Wi-Fi, 5G, LTE
    private String productDate;
    private String serialNum; // 일련번호
    private static int cnt = 0;

    public GalaxyTab() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now);
        cnt++;
        productDate += cnt;
    }

    public boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== 갤럭시 탭 구매하기 ====");
        System.out.println("구입 : yes / 종료 : quit");
        String isContinue = sc.next();
        if(isContinue.equalsIgnoreCase("yes")) return true;
        return false;
    }

    public void setTapType() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("탭 유형 [1] S [2] A : ");
            tapType = sc.nextInt();
            if(tapType == 1 || tapType == 2) return;
            else System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void setScreenSize() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("화면 크기 [1]12인치 [2]13인치 [3]14인치 : ");
            screenSize = sc.nextInt();
            if(screenSize >= 1 && screenSize <= 3) return;
            else System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void setMemory() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("용량 [1]64GB [2]128GB [3]256GB : ");
            memory = sc.nextInt();
            if(memory >= 1 && memory <= 3) return;
            else System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void setColor() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("색상 [1]그라파이트 [2]실버 [3]핑크골드 : ");
            color = sc.nextInt();
            if(color >= 1 && color <= 3) return;
            else System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void setNetwork() {
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 [1]Wi-Fi [2]5G [3]LTE : ");
        network = sc.nextInt();
        if(network == 1 || network == 2) return;
        else System.out.println("잘못 입력하셨습니다.");
    }
    // 일련 번호 : S1264GW2301121
    public void setSerialNum() {
        String typeStr = (tapType == 1) ? "S" : "T";
        String[] scrStr = {"", "12", "13", "14"};
        String[] memStr = {"", "64", "128", "256"};
        String[] colorStr = {"", "G", "S", "P"};
        String[] netStr = {"", "W", "5", "L"};
        serialNum = typeStr + scrStr[screenSize] + memStr[memory] + colorStr[color] + netStr[network] + productDate;
    }

    public void makeTab() throws InterruptedException{
        int cnt = 0;
        while(true) {
            sleep(20);
            cnt++;
            System.out.print("<< 갤럭시탭 제작중 : [" + cnt + "%] >>");
            System.out.print("\r");
            if(cnt >= 100) break;
        }
    }

    public void TabInfo() {
        final String[] tabType = {"", "S", "T"};
        final String[] scrType = {"", "12인치", "13인치", "14인치"};
        final String[] memType = {"", "64GB", "128GB", "256GB"};
        final String[] colType = {"", "그라파이트", "실버", "핑크골드"};
        final String[] netType = {"", "Wi-Fi", "5G", "LTE"};
        System.out.println("==== 갤럭시  탭이 출고 되었습니다. ====");
        System.out.println("탭 유형 : " + tabType[tapType]);
        System.out.println("화면 크기 : " + scrType[screenSize]);
        System.out.println("용량 : " + memType[memory]);
        System.out.println("색상 : " + colType[color]);
        System.out.println("용량 : " + netType[network]);
        System.out.println("일련 번호 : " + serialNum);
    }
}
