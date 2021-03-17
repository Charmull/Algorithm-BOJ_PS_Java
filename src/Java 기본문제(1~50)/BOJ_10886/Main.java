package BOJ_10886;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int no = 0;
        int yes = 0;

        for(int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if(temp == 0) {
                no++;
            }
            else {
                yes++;
            }
        }

        System.out.println(no>yes? "Junhee is not cute!" : "Junhee is cute!");
    }
}
