package Solving_Step_by_Step.Chap12.BOJ_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String input = br.readLine();
        int len = input.length();
        Integer[] arr = new Integer[len];

        for(int i = 0; i < len; i++) {
            arr[i] = input.charAt(i) - '0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int num : arr) {
            sb.append(num);
        }

        System.out.println(sb);
        br.close();
    }
}
