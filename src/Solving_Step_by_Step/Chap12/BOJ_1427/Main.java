package Solving_Step_by_Step.Chap12.BOJ_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int[] count = new int[10];
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - '0']++;
        }

        for(int i = 9; i >= 0; i--) {
            while(count[i]-- > 0) {
                sb.append(i);
            }
        }

        System.out.println(sb);
        br.close();
    }
}
