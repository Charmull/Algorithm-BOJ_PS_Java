package Solving_Step_by_Step.Chap01.BOJ_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        System.out.println(A * (B % 10));
        System.out.println(A * ((B % 100) /10));
        System.out.println(A * (B / 100));
        System.out.println(A * B);

        br.close();
    }
}
