package BOJ_2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        hour = (hour + ((min + time) / 60)) % 24;
        min = (min + time) % 60;

        System.out.println(String.format("%d %d", hour, min));
    }
}