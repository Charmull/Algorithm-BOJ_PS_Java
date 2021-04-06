package Solving_Step_by_Step.Chap07.BOJ_2908;

import java.io.*;
import java.util.StringTokenizer;

// StringBuilder의 reverse 메소드 쓰기
public class OtherSolve02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // st.nextToken(String 형)을 값으로 가지는 StringBuilder을 생성한다. 이때 매개변수로 넘겨진 값은 (String 타입에서) StringBuilder 타입으로 변환한다.
        // 그리고 reverse() 메소드를 통해 저장되어있던 문자열을 뒤집어준다. 그리고 이를 다시 String 타입으로 변환시켜준다.
        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        bw.write(Integer.toString(Math.max(A, B)));

        br.close();
        bw.flush();
        bw.close();
    }
}
