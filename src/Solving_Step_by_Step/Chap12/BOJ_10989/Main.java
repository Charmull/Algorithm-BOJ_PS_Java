package Solving_Step_by_Step.Chap12.BOJ_10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10000];
        for(int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[temp - 1]++;
        }

        for(int i = 0; i < 10000; i++) {
            while(arr[i] > 0) {
                sb.append(i+1).append('\n');
                arr[i]--;
            }
        }

        System.out.println(sb);
        br.close();
    }
}
