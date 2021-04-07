package Solving_Step_by_Step.Chap08.BOJ_1712;

import java.io.*;
import java.util.StringTokenizer;

// 틀렸습니다. -> 원인 : line 22에서, B*count나 C*count 연산 과정 중 overflow 발생할 수 있음. overflow 발생을 막기 위해 long형으로 변수를 바꿔야하는데, 워낙 수가 커서 시간초과가 날 것.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int count = 0;

        if(B >= C) {
            System.out.println(-1);
        }
        else {
            while(true) {
                if(A + B*count < C*count) {     // if((C-B)*count > A) 로 바꾸면 정답처리됨. (C-B)*count에서 int 범위를 넘어가지 않는 것 같음.
                    break;
                }
                else {
                    count++;
                }
            }

            System.out.println(count);
        }

        br.close();
    }
}
