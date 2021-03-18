package Java_Basic_Problem01.BOJ_10103;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cy = 100, sd = 100;

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if(a > b) {
                sd -= a;
            }
            else if(a < b) {
                cy -= b;
            }
        }

        System.out.printf("%d\n%d", cy, sd);
    }
}
