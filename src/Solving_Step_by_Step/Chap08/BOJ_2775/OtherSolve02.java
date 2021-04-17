package Solving_Step_by_Step.Chap08.BOJ_2775;

import java.io.*;

public class OtherSolve02 {
    // k층의 n호에 입주해야하는 인원수를 리턴해주는 함수
    public static int people(int k, int n) {
        int result = 0;
        if(n == 1) {
            return 1;
        }
        else if(k == 0) {
            return n;
        }
        else {
            result += people(k, n-1) + people(k-1, n);
            return result;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int result = people(k, n);

            sb.append(result).append("\n");
        }

        System.out.print(sb);

        br.close();
    }
}

// NOTE : StringBuilder를 썼을때 소요 시간은 276ms, 메모리는 14432KB
//        BufferedWriter를 썼을때 소요 시간은 296ms, 메모리는 14912KB
//        StringBuilder가 BufferedWriter에 비해 효율이 좋다.
// TODO : 추후 StringBuilder와 BufferedWriter의 차이에 대해 더 공부하고 정리해보자.


// - StringBuilder 에 대해
// StringBuilder 사용하는 이유 : String은 immutable(불변)하기때문에 서로 다른 String을 더하는 연산을 하면 새로운 String을 생성한다.
//                             즉, String으로 연산을 하면 메모리 할당과 메모리 해제를 발생시키며 성능적으로 좋지 않다.
//                             StringBuilder는 String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라, 기존의 데이터에 더하는 방식을 사용한다.
//                             따라서 속도도 빠르며 상대적으로 부하가 적다. 그래서 (빈번하게) 긴 문자열을 더하는 상황이 발생하는 경우 StringBuilder를 사용하는 것이 좋다.
// StringBuilder 사용하는 방법 : StringBuilder 인스턴스를 생성하여, append() 메소드를 통해 문자열을 더할 수 있다.
//                             만들어진 문자열을 출력하기 위해서는 toString() 메소드를 사용하면 된다.
// 출처 : https://hardlearner.tistory.com/288

// - BufferedWriter 에 대해
// BufferedWriter 사용하는 이융 : 많은 양의 출력이 필요할 때, 버퍼에 담아 한 번에 출력하기 때문에 성능면에서 우수하다.
// BufferedWriter 사용하는 방법 : BufferedWriter 인스턴스를 생성하여, write() 메소드를 통해 출력한다.
//                              개행을 위해 "\n"을 출력하거나, newLine() 메소드를 이용한다.
//                              버퍼를 이용하기 때문에 다 쓴 뒤에 flush() 메소드로 버퍼를 클린하게 해줘야 한다.