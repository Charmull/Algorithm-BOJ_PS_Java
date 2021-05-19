package Solving_Step_by_Step.Chap09.BOJ_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 : 14688KB, 시간 : 148ms
public class OtherSolve01 {
    public static void returnPrime(int num, StringBuilder sb) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            while(num % i == 0) {
                sb.append(i).append('\n');
                num /= i;
            }
        }

        if(num != 1) {
            sb.append(num);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        returnPrime(N, sb);
        System.out.println(sb);

        br.close();
    }
}
