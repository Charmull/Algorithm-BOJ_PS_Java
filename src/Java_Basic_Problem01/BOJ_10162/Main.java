package Java_Basic_Problem01.BOJ_10162;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int A = 0, B = 0, C = 0;

        if(T % 10 != 0) {
            System.out.println(-1);
            return ;
        }

        while(T - 300 >= 0) {
            T -= 300;
            A++;
        }
        while(T - 60 >= 0) {
            T -= 60;
            B++;
        }
        while(T - 10 >= 0) {
            T -= 10;
            C++;
        }
        System.out.printf("%d %d %d", A, B, C);
    }
}
