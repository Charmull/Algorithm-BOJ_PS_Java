package Solving_Step_by_Step.Chap07.BOJ_11720;

import java.io.*;

public class OtherSolve02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum+= input.charAt(i) - 48;
        }

        bw.write(Integer.toString(sum));

        br.close();
        bw.flush();
        bw.close();
    }
}

// java 입력관련 클래스 공부하기(https://st-lab.tistory.com/41?category=830901)