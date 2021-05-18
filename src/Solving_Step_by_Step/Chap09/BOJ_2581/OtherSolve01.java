package Solving_Step_by_Step.Chap09.BOJ_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OtherSolve01 {
    public static boolean[] isPrime(int max) {
        boolean[] isPrime = new boolean[max+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i <= Math.sqrt(max); i++) {
            if(isPrime[i]) {
                for(int j = i*2; j < max + 1; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean[] primeArr = isPrime(10000);

        int min = 10001;
        int sum = 0;
        for(int i = M; i <= N; i++) {
            if(primeArr[i]) {
                sum += i;
                min = min > i ? i : min;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }

        br.close();
    }
}
