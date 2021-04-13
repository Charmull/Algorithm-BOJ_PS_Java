package Solving_Step_by_Step.Chap08.BOJ_2775;

import java.io.*;

// '1 <= k, n <= int 최대 범위' 까지 실행되도록 코드 작성함.
// 문제 자체에 대한 답으로는 시간 측면에 있어서 효율적이지 못함. (376ms)
// 문제에서 k와 n의 크기에 대한 조건이 바뀌어도 수정 필요 없음.
// TODO: 추후에 더 공부하고 정리해보자.
public class Main {
    // k층의 n호에 입주해야하는 인원수를 리턴해주는 함수
    public static int people(int k, int n) {
        int result = 0;
        if(n == 1) {
            return 1;
        }
        else {
            if(k == 0) {
                return n;
            }
            else {
                for(int i = 1; i <= n; i++) {
                    result += people(k-1, i);
                }
                return result;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int result = 0;

            if(k == 0) {
                result = n;
            }
            else {
                result = people(k, n);
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
