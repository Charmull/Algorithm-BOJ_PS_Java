package BOJ_10039;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int average = 0;

        for (int i = 0; i < 5; i++) {
            int score = sc.nextInt();
            if (score < 40) {
                score = 40;
            }
            average += score;
        }
        average /= 5;
        System.out.println(average);
    }
}