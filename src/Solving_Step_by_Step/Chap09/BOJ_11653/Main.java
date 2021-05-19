package Solving_Step_by_Step.Chap09.BOJ_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 : 14692KB, 시간 : 168ms
public class Main {
    public static void returnPrime(int num, StringBuilder sb) {
        int i = 2;
        while(num != 1) {
            if(num % i == 0) {
                sb.append(i).append('\n');
                num /= i;
            }
            else {
                i++;
            }
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
