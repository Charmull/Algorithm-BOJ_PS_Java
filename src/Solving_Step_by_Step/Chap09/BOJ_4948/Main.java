package Solving_Step_by_Step.Chap09.BOJ_4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int returnPrime(int n) {
        boolean[] isPrimeArr = new boolean[n*2 + 1];
        Arrays.fill(isPrimeArr, true);
        isPrimeArr[0] = isPrimeArr[1] = false;

        for(int i = 2; i <= Math.sqrt(2*n + 1); i++) {
            if(isPrimeArr[i]) {
                for(int j = i*2; j < 2*n + 1; j += i) {
                    isPrimeArr[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = n+1; i <= n*2; i++) {
            if(isPrimeArr[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while(n != 0) {
            int count = returnPrime(n);
            sb.append(count).append('\n');
            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb);

        br.close();
    }
}
