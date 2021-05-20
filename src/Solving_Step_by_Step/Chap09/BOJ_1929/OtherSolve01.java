package Solving_Step_by_Step.Chap09.BOJ_1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class OtherSolve01 {
    private static void isPrime(int start, int end) {
        StringBuilder sb = new StringBuilder();
        boolean[] primeArr = new boolean[end + 1];
        Arrays.fill(primeArr, true);
        primeArr[0] = primeArr[1] = false;

        for(int i = 2; i <= Math.sqrt(end); i++) {
            if(primeArr[i]) {
                for(int j = i*2; j < end+1; j = j+i) {
                    primeArr[j] = false;
                }
            }
        }

        for(int i = start; i <= end; i++) {
            if(primeArr[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        isPrime(M, N);

        br.close();
    }
}
