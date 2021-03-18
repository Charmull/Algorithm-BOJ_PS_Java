package Java_Basic_Problem01.BOJ_5086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int A = sc.nextInt(), B = sc.nextInt();

            if(A == 0 && B == 0) {
                break;
            }

            if(Math.max(A, B) % Math.min(A, B) == 0) {
                if(Math.max(A, B) == A) {
                    System.out.println("multiple");
                }
                else {
                    System.out.println("factor");
                }
            }
            else {
                System.out.println("neither");
            }
        }
    }
}
