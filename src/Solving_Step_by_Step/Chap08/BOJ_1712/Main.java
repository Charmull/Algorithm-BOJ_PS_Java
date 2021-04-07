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

// overflow 문제 발생
// line 22에서, B*count나 C*count 연산 과정 중 overflow 발생할 수 있음.
// overflow 발생을 막기 위해 long형으로 변수를 바꿔야하는데, B나 C를 long형으로 바꾸면 워낙 수가 커서 시간초과가 남.
// 시간초과나는 경우 : 1000000000 1 2 를 넣으면 시간초과 발생. -> 이것은 count를 long형으로 바꿔도 발생하는 부분 아닌가? 왜 정답처리 되었나?@@
// int 범위 초과의 경우 : 2000000000 1 2 를 넣으면 A+B*count 에서 int 범위를 초과해 값이 이상해짐. -> 이는 count를 long형으로 바꿔주면 됨.(밑의 방법2)
// 이 코드를 사용하여 해결하는 방법1 : line 22를 if((C-B)*count > A) 로 바꾸면 정답처리됨. (C-B)*count에서 int 범위를 넘어가지 않는 것 같음.
// 이 코드를 사용하여 해결하는 방법2 : count를 long형으로 바꾸니 정답 인정됨. -> 시간초과에서 걸려야 정상인것 같은데 걸리지않음.@@

// 추후, 시간초과나는 경우(, overflow가 발생하는 경우)에 대해 더 공부해볼 필요 있음.
// 경우 1 : 현재 코드 (overflow 발생으로 오답처리, 아마 시간초과도 발생할것)
// 경우 2 : line 22를 if((C-B)*count > A)로 바꾸기 (정답처리. 그런데 시간초과 발생할 수 있지 않나 탐구 필요)
// 경우 3 : count를 long형으로 바꾸기 (정답처리, 그런데 시간초과 발생할 수 있지 않나 탐구 필요)
// 경우 4 : A,B,C를 long형으로 바꾸기 (시간초과, overflow는 발생하지 않을 것)