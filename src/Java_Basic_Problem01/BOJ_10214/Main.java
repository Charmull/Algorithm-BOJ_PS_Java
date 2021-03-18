package Java_Basic_Problem01.BOJ_10214;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int yResult = 0;
            int kResult = 0;

            for(int j = 0; j < 9; j++) {
                yResult += sc.nextInt();
                kResult += sc.nextInt();
            }

            if(yResult > kResult) {
                System.out.println("Yonsei");
            }
            else if(kResult > yResult) {
                System.out.println("Korea");
            }
            else {
                System.out.println("Draw");
            }
        }
    }
}
