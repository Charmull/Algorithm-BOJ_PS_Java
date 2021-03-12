package BOJ_2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int a = A * (B % 10);
        int b = A * ((B % 100) / 10);
        int c = A * (B / 100);
        System.out.println(String.format("%d\n%d\n%d\n%d", a, b, c, a + b*10 + c*100));
    }
}