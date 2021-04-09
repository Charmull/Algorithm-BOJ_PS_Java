package Solving_Step_by_Step.Chap08.BOJ_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int oneDay = A-B;       // 하루에 총 올라가는 양 (올라가는 높이 - 미끄러지는 높이)
        int result = (V-B)/oneDay;      // 목적지에 도달하는 날은 미끄러지지 않는데, 이미 oneDay에서 미끄러지는 높이를 뺐으므로, (다음과 같이 나눠서 계산하려면) V에 B를 한번 빼준다.
                                        // 다른 말로 정리하자면, 목적지에 도달하는 날은 미끄러지지 않으니 총 V-B미터만큼을 올라가는 것과 같다.
        if((V-B)%oneDay != 0) {
            result++;
        }

        System.out.println(result);
    }
}
