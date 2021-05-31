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

// System.out.println(R*R*Math.PI + "\n" + R*R*2.0) 의 경우,
//  print 전에 연산이 필요해서인지 시간과 메모리가 더 많이 요구된다. (16276KB, 160ms)

// int R = Integer.parseInt(br.readLine()) 의 경우,
//  후에 int형과 double형의 연산에서 int형을 double형으로 바꾼 후 계산을 하기때문인지 더 많은 시간과 메모리가 요구된다. (14220KB, 132ms)

// System.out.println(R*R*2) 의 경우,
//  double형 2개와 int형 1개를 연산하는 것이기때문에, int형을 double형으로 바꾼 후 계산을 해서인지 더 많은 메모리가 요구된다.
//  아마 시간도 약간 더 걸릴 것으로 예상된다. (14188KB, 124ms)

// 현재 코드는 14172KB, 124ms