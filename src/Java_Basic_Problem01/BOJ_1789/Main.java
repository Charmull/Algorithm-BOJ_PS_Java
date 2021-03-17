package Java_Basic_Problem01.BOJ_1789;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        int i = 0;

        while(S > 0) {
            if(S - (i+1) < 0) {
                break;
            }
            i++;
            S -= i;
        }
        System.out.println(i);
    }
}