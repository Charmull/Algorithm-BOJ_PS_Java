package Solving_Step_by_Step.Chap07.BOJ_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        for(int i = 97; i < 123; i++) {
            // i는 int형이지만, 아스키코드로 봤을때 a~z까지의 문자(char)이다.
            // S.indexOf()의 매개변수로 i를 넘기면, a~z까지의 char를 넘기는 것과 같다. ( S.indexOf((char)i)와 같음 )
            System.out.print(S.indexOf(i) + " ");
        }

        br.close();
    }
}
