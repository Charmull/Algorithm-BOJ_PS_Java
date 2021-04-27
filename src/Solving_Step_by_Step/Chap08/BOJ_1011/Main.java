package Solving_Step_by_Step.Chap08.BOJ_1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
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

            int k = 0;
            boolean flag = false;   // x에서 y지점까지 홀수번 작동하는가
            while(distance > 0) {
                if(distance - (k+1) <= 0) {     // 현재 남은 거리에서 (최대) k+1을 1번만 빼도 도착하는 경우(x에서 y까지 홀수번 작동)
                                                // 현재 남은 거리에서 k 이상 k+1 이하의 수를 뺐을 때 남은 거리가 0이 되는 경우
                    distance -= ++k;
                    flag = true;
                }
                else if(distance - (k+1)*2 <= 0) {      // 현재 남은 거리에서 (최대) k+1을 2번 빼야 도착하는 경우(x에서 y까지 짝수번 작동)
                                                        // 현재 남은 거리에서 k+1 초과 (k+1)*2 이하의 수를 뺐을 때 남은 거리가 0이 되는 경우
                    distance -= (++k)*2;
                    flag = false;
                }
                else {
                    distance -= (++k)*2;          // 현재 남은 거리에서 (k+1)*2를 빼도 남은 도착하지 않는 경우
                }
            }

            sb.append((flag == false ? k*2 : k*2-1) + "\n");
        }

        System.out.print(sb);
        br.close();
    }
}
