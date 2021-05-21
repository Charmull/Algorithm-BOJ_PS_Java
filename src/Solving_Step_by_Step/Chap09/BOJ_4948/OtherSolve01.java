package Solving_Step_by_Step.Chap09.BOJ_4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OtherSolve01 {
    private static boolean[] isPrimeArr(int max) {
        boolean[] primeArr = new boolean[max + 1];
        Arrays.fill(primeArr, true);
        primeArr[0] = primeArr[1] = false;

        for(int i = 2; i <= Math.sqrt(max + 1); i++) {
            if(primeArr[i]) {
                for(int j = i*2; j < max + 1; j += i) {
                    primeArr[j] = false;
                }
            }
        }

        return primeArr;
    }

    private static int[] countPrimeArr(boolean[] primeArr) {
        int[] countPrime = new int[primeArr.length];
        int count = 0;
        for(int i = 2; i < primeArr.length; i++) {
            if(primeArr[i]) {
                count++;
            }
            countPrime[i] = count;
        }

        return countPrime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        boolean[] isPrime = isPrimeArr(246912);
        int[] countPrime = countPrimeArr(isPrime);

        while(n != 0) {
            sb.append(countPrime[n*2] - countPrime[n]).append('\n');
            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb);

        br.close();
    }
}
