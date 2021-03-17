package Java_Basic_Problem01.BOJ_2530;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        int time = sc.nextInt();

        hour = (hour + ((min + ((sec + time) / 60)) / 60)) % 24;
        min = (min + ((sec + time) / 60)) % 60;
        sec = (sec + time) % 60;

        System.out.println(String.format("%d %d %d", hour, min, sec));
    }
}