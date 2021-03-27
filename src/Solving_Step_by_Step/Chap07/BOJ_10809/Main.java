package Solving_Step_by_Step.Chap07.BOJ_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        String S = br.readLine();

        for(int i = 0; i < S.length(); i++) {
            int idx = S.charAt(i) - 97;
            if(arr[idx] != -1) {
                continue;
            }
            else {
                arr[idx] = i;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        br.close();
    }
}
