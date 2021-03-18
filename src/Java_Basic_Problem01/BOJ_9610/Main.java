package Java_Basic_Problem01.BOJ_9610;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Q1 = 0, Q2 = 0, Q3 = 0, Q4 = 0, AXIS = 0;

        for(int i = 0; i < n; i++) {
            double x = sc.nextDouble(), y = sc.nextDouble();

            if(x == 0 || y == 0) {
                AXIS++;
            }
            else if(x > 0) {
                if(y > 0) {
                    Q1++;
                }
                else {
                    Q4++;
                }
            }
            else {
                if(y > 0) {
                    Q2++;
                }
                else {
                    Q3++;
                }
            }
        }

        System.out.printf("Q1: %d\nQ2: %d\nQ3: %d\nQ4: %d\nAXIS: %d", Q1, Q2, Q3, Q4, AXIS);
    }
}
