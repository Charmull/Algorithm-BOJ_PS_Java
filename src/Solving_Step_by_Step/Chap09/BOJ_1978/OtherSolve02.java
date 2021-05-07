package Solving_Step_by_Step.Chap09.BOJ_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// TODO : 문제에 맞춰서 범위가 정해져있어야만 가능한 풀이. 범위를 늘릴 방법은?
public class OtherSolve02 {
    public static boolean[] makePrime(int max) {
        boolean[] isPrime = new boolean[max + 1];
        isPrime[0] = true;
        isPrime[1] = true;

        for(int i = 2; i <= Math.sqrt(max); i++) {
            if(isPrime[i] == false) {
                for(int j = i*i; j < max + 1; j = j+i) {
                    isPrime[j] = true;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean[] primeArr = makePrime(1000);
        int count = 0;
        for(int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(primeArr[temp] == false) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
