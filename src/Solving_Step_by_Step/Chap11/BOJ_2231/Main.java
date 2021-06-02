package Solving_Step_by_Step.Chap11.BOJ_2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int decompositionSum(int n) {
        int sum = n;
        while(n != 0) {
            sum += n%10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int i = 1;
        for( ; i < N; i++) {
            int temp = decompositionSum(i);
            if(temp == N) {
                System.out.println(i);
                break;
            }
        }

        if(i == N) {
            System.out.println(0);
        }

        br.close();
    }
}
