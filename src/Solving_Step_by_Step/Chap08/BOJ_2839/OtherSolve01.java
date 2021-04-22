package Solving_Step_by_Step.Chap08.BOJ_2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// while문 쓰지 않고 규칙 찾아서 푸는 방법
public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int fiveNum = N/5;
        int left = N%5;

        if(left == 0) {
            System.out.println(fiveNum);
        }else if(left == 1 && fiveNum >= 1) {
            System.out.println(fiveNum + 1);
        }else if(left == 2 && fiveNum >= 2) {
            System.out.println(fiveNum + 2);
        }else if(left == 3) {
            System.out.println(fiveNum + 1);
        }else if(left == 4 && fiveNum >= 1) {
            System.out.println(fiveNum + 2);
        }else {
            System.out.println(-1);
        }
        
        br.close();
    }
}
