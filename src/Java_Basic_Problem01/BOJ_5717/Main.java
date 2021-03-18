package Java_Basic_Problem01.BOJ_5717;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int M = sc.nextInt(), F = sc.nextInt();

            if(M == 0 && F == 0) {
                break;
            }

            System.out.println(M + F);
        }
    }
}
