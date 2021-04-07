package Solving_Step_by_Step.Chap08.BOJ_1712;

import java.io.*;
import java.util.StringTokenizer;

// 틀렸습니다. -> 원인 찾지 못함(210407)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int count = 0;

        if(B >= C) {
            System.out.println(-1);
        }
        else {
            while(true) {
                if(A + B*count < C*count) {
                    break;
                }
                else {
                    count++;
                }
            }

            System.out.println(count);
        }

        br.close();
    }
}
