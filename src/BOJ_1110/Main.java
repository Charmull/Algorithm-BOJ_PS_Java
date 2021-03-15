package BOJ_1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int changedNum = num;
        int N = 0;

        while(true) {
            changedNum = (changedNum%10)*10 + (changedNum/10 + changedNum%10)%10;
            N++;

            if(num == changedNum) {
                System.out.println(N);
                break;
            }
        }
    }
}