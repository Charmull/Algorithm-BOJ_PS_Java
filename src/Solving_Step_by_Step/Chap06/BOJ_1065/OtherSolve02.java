package Solving_Step_by_Step.Chap06.BOJ_1065;

import java.io.*;

// 문제 조건에 있어 (N은 1000까지 입력, 최대 4자릿수) 알맞은 숏코딩
public class OtherSolve02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            if(i < 100 && i > 0) {
                sum++;
            }
            else if((i/100 - i%100/10) == (i%100/10 - i%100%10)) {
                sum++;
            }
        }
        bw.write(Integer.toString(sum));

        br.close();
        bw.flush();
        bw.close();
    }
}
