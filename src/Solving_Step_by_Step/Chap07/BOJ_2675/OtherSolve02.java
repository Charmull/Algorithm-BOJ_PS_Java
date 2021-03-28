package Solving_Step_by_Step.Chap07.BOJ_2675;

import java.io.*;
import java.util.StringTokenizer;

// for문을 한번 덜 쓰기위해 내가 생각해낸 방법
// 그러나 Main파일의 경우에 비해 메모리는 줄되, 시간이 늘어난다.
// 그냥 이런 방법(string의 repeat 메서드 사용하기)도 있다는 사실을 알아놓자.
public class OtherSolve02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for(int j = 0; j < S.length(); j++) {
                bw.write(S.substring(j, j+1).repeat(R));
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
