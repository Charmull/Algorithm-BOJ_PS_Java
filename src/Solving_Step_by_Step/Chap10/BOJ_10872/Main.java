package Solving_Step_by_Step.Chap10.BOJ_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(n));

        br.close();
    }
}
