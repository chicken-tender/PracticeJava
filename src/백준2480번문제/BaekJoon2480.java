package 백준2480번문제;

public class BaekJoon2480 {
    public static void main(String[] args) {
        int[] rand = new int[3];
            rand[0] = (int)((Math.random() * 6) + 1);
            rand[1] = (int)((Math.random() * 6) + 1);
            rand[2] = (int)((Math.random() * 6) + 1);

            int max = rand[0];
            for(int e : rand) {
                if(max < e) max = e;
            }

            if(rand[0] == rand[1] && rand[1] == rand[2]) {
                System.out.printf("%d, %d, %d 총 상금 : %d원",rand[0],rand[1],rand[2],10000+max*1000);
            }
            else if(rand[0] == rand[1]) {
                System.out.printf("%d, %d, %d 총 상금 : %d원",rand[0],rand[1],rand[2],1000+max*100);
            } else if(rand[1] == rand[2]){
                System.out.printf("%d, %d, %d 총 상금 : %d원",rand[0],rand[1],rand[2],1000+max*100);
            } else if(rand[0] == rand[2]) {
                System.out.printf("%d, %d, %d 총 상금 : %d원",rand[0],rand[1],rand[2],1000+max*100);
            } else System.out.printf("%d, %d, %d 총 상금 : %d원",rand[0],rand[1],rand[2],max*100);

    }
}
