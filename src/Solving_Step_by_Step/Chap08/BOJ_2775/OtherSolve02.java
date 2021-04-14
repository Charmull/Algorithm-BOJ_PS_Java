package Solving_Step_by_Step.Chap08.BOJ_2775;

import java.io.*;

public class OtherSolve02 {
    // k층의 n호에 입주해야하는 인원수를 리턴해주는 함수
    public static int people(int k, int n) {
        int result = 0;
        if(n == 1) {
            return 1;
        }
        else if(k == 0) {
            return n;
        }
        else {
            result += people(k, n-1) + people(k-1, n);
            return result;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int result = people(k, n);

            sb.append(result).append("\n");
        }

        System.out.print(sb);

        br.close();
    }
}
