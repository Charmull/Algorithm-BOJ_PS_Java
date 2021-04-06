package Solving_Step_by_Step.Chap07.BOJ_2908;

import java.io.IOException;

public class OtherSolve03 {
    public static void main(String[] args) throws IOException {
        int A = 0, B = 0;

        // 입력을 1byte씩 읽어와서 뒤집힌 값을 만들어 저장해준다.
        A += System.in.read() - 48;
        A += (System.in.read() - 48)*10;
        A += (System.in.read() - 48)*100;

        // 중간의 공백을 받는다.
        System.in.read();

        B += System.in.read() - 48;
        B += (System.in.read() - 48)*10;
        B += (System.in.read() - 48)*100;

        System.out.println(A > B? A : B);
    }
}
