package Solving_Step_by_Step.Chap09.BOJ_9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OtherSolve01 {
    static StringBuilder sb = new StringBuilder();

    private static boolean[] isPrimeArr(int max) {
        boolean[] primeArr = new boolean[max + 1];
        Arrays.fill(primeArr, true);
        primeArr[0] = primeArr[1] = false;

        for(int i = 2; i <= Math.sqrt(max + 1); i++) {
            for(int j = i*i; j < max+1 && primeArr[j]; j += i) {
                primeArr[j] = false;
            }
        }

        return primeArr;
    }

    private static void goldbach(boolean[] arr, int n) {
        for(int i = n/2; i >= 2; i--) {
            if(arr[i] && arr[n-i]) {
                sb.append(i).append(' ').append(n-i).append('\n');
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean[] primeArr = isPrimeArr(10000);

        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            goldbach(primeArr, n);
        }

        System.out.println(sb);
        br.close();
    }
}
