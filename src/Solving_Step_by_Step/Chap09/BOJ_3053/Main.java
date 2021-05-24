package Solving_Step_by_Step.Chap09.BOJ_3053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO : 메모리, 시간 줄이는 방법 정리 (백준 사이트에 올린 4가지 방법 비교)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double R = Double.parseDouble(br.readLine());
        System.out.println(R*R*Math.PI);
        System.out.println(R*R*2.0);

        br.close();
    }
}
