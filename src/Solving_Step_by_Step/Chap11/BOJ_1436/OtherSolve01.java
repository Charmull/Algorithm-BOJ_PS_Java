package Solving_Step_by_Step.Chap11.BOJ_1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 1;
        int i = 666;    // i는 출력값(result)
        while(count < n) {
            i++;
            String strI = Integer.toString(i);
            if(strI.contains("666")) {
                count++;
            }
        }

        System.out.println(i);

        br.close();
    }
}

// 16~17 line을 'String.valueOf(i).contains("666")'으로 하면 더 많은 메모리와 시간이 소비됨.
