package Solving_Step_by_Step.Chap12.BOJ_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class OtherSolve02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split("");   // 한번에 split으로 string array 생성

        Arrays.sort(input, Collections.reverseOrder());
        for(String num : input) {
            sb.append(num);
        }

        System.out.println(sb);
        br.close();
    }
}
