package Solving_Step_by_Step.Chap08.BOJ_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int line = 1;
        int range = 2;

        while(range <= N) {
            range += 6*(line++);
        }
        System.out.println(line);
    }
}
