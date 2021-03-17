package Java_Basic_Problem01.BOJ_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        if(min - 45 < 0) {
            hour -= 1;
            min += 15;
        }
        else {
            min -= 45;
        }

        if(hour < 0) {
            hour += 24;
        }
        System.out.println(String.format("%d %d", hour, min));
    }
}