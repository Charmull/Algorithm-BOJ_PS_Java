package Solving_Step_by_Step.Chap09.BOJ_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void returnPrime(int num) {
        int temp = 2;
        while(num != 1) {
            if(num % temp == 0) {
                System.out.println(temp);
                num /= temp;
            }
            else {
                temp++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        returnPrime(N);
        br.close();
    }
}
