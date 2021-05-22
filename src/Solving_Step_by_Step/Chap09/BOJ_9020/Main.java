package Solving_Step_by_Step.Chap09.BOJ_9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static boolean[] isPrimeArr(int max) {
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i <= Math.sqrt(max + 1); i++) {
            if(isPrime[i]) {
                for(int j = i*2; j < max+1; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    private static StringBuilder goldbach(int n, boolean[] isPrimeArr, StringBuilder sb) {
        for(int i = n/2; i >= 2; i--) {
            if(isPrimeArr[i]) {
                if(isPrimeArr[n-i]) {
                    sb.append(i).append(" ").append(n-i).append("\n");
                    break;
                }
            }
        }

        return sb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        boolean[] isPrime = isPrimeArr(10000);

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            goldbach(n, isPrime, sb);
        }

        System.out.println(sb);

        br.close();
    }
}
