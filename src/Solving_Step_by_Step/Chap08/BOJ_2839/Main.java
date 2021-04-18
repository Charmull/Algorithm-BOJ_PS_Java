package Solving_Step_by_Step.Chap08.BOJ_2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO : 다양한 풀이법 공부해보기
// 이 코드의 풀이법
// 1. 입력된 수(N)에서 가능한 한 많은 5kg 봉지가 포함되게끔 5kg 봉지의 수를 구하고, 이를 fiveNum이라 한다. (fiveNum = N/5)
// 2. 위의 값에서 남은 수(left)가 0일 때는 fiveNum 출력, (초기 left = N%5)
//    위의 값에서 남은 수(left)에서 3을 나눈 나머지(left%3)가 0일 때는 fiveNum + left/3 출력,
//    둘 다 해당이 안 될 시에는 fiveNum--을 해 다시 위의 두 경우에 해당되는지 확인한다. (fiveNum >= 0일 동안 반복)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int fiveNum = N/5;
        int left = N%5;

        while(fiveNum >= 0) {
            left = N - fiveNum*5;
            if(left == 0) {
                break;
            }
            else if(left%3 == 0) {
                break;
            }
            else {
                fiveNum--;
            }
        }

        if(fiveNum < 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(fiveNum + left/3);
        }

        br.close();
    }
}
