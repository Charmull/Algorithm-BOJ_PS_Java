package Java_Basic_Problem01.BOJ_10162;

import java.util.Scanner;

public class BestAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = T/300;
        int b = (T%300)/60;
        int c = ((T%300)%60)/10;

        if(T%10 != 0) {
            System.out.println(-1);
        }
        else {
            System.out.printf("%d %d %d", a, b, c);
        }
    }
}
