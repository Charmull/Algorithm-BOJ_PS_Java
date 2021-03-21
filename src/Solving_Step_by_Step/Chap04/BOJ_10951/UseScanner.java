package Solving_Step_by_Step.Chap04.BOJ_10951;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
