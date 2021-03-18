package Java_Basic_Problem01.BOJ_11557;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            String maxS = sc.next();
            int maxL = sc.nextInt();
            for(int j = 1; j < N; j++) {
                String S = sc.next();
                int L = sc.nextInt();
                if(maxL < L) {
                    maxS = S;
                    maxL = L;
                }
            }
            System.out.println(maxS);
        }
    }
}
