package Solving_Step_by_Step.Chap11.BOJ_1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int i = 666;    // i는 출력값(result)
        while(count < n) {
            String strI = Integer.toString(i);
            int countSix = 0;   // strI에서의 6의 개수 (연속하지 않을 경우 다시 0 대입)
            for(int j = 0; j < strI.length(); j++) {
                if(strI.charAt(j) != '6') {
                    countSix = 0;
                }
                else {
                    countSix++;
                }

                if(countSix == 3) {
                    break;
                }
            }

            if(countSix == 3) {
                count++;
            }
            i++;
        }

        System.out.println(--i);

        br.close();
    }
}
