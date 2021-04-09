package Solving_Step_by_Step.Chap08.BOJ_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        System.out.println((int) Math.ceil((double) (V-B)/(A-B)));
        // (V-B)/(A-B)가 나누어떨어지지 않을때, Math의 ceil 메소드를 통해 올림처리한다.
        // ceil 메소드를 쓰면 실수형이 리턴되므로, int형으로 바꿔준다.
        // + : (V-B)/(A-B)의 결과에 double형을 취해주는 이유는, (V-B)/(A-B)의 결과 자체가 int형이기때문에 소수점 밑이 잘리기 때문이다. 그 잘린 값이 ceil 메소드의 매개변수로 들어가면 의미가 없다.
    }
}
