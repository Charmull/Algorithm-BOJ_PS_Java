package Java_Basic_Problem01.BOJ_1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // System.in 입력한 값을 바이트 단위로 읽기
        double A, B;
        A = sc.nextDouble();
        B = sc.nextDouble();

        System.out.println(A / B);
    }
}