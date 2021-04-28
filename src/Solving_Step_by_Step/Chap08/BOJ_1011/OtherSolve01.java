package Solving_Step_by_Step.Chap08.BOJ_1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2중 반복문을 사용하지 않고, 규칙을 찾아 해결하는 방법
public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int distance = y - x;

            int max = (int)Math.sqrt(distance);     // max는 distance를 이동할때의 한번에 이동하는 가장 큰 수
                                                    // max는 distance의 제곱근 (int형)

            if(max == Math.sqrt(distance)) {        // Math.sqrt(distance)가 max와 같으면 (이 때는 max값이 변할 때와 같다)
                sb.append(max*2 - 1).append("\n");
            }
            else if(distance <= max*max + max) {    // max*max < distance <= max*max + max 일때
                sb.append(max*2).append("\n");
            }
            else {                                  // max*max + max < distance <= (max+1)*(max+1) - 1
                sb.append(max*2 + 1).append("\n");
            }
        }

        System.out.print(sb);
        br.close();
    }
}
