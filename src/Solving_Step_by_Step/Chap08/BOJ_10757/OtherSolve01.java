package Solving_Step_by_Step.Chap08.BOJ_10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 배열 사용하기
public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 두 수를 String 형태로 초기화 정의
        String strA = st.nextToken();
        String strB = st.nextToken();

        int maxLen = Math.max(strA.length(), strB.length());

        // strA와 strB를 1의 자리부터 한자리씩 담을 int[]를 정의한다.
        int[] A = new int[maxLen];
        int[] B = new int[maxLen];

        // 배열 A와 B에 (0번째 인덱스부터) strA와 strB의 1의 자리(마지막 char)부터 담는다.
        for(int i = strA.length()-1, j = 0; i >= 0; i--, j++) {
            A[j] = strA.charAt(i) - '0';
        }
        for(int i = strB.length()-1, j = 0; i >= 0; i--, j++) {
            B[j] = strB.charAt(i) - '0';
        }

        // 배열 A와 B를 0번째 인덱스부터 더해 배열 result에 저장한다. result는 overflow 생길 가능성 있으니 요소의 수는 maxLen + 1개로 한다.
        int[] result = new int[maxLen + 1];
        for(int i = 0; i < maxLen; i++) {
            int val = A[i] + B[i] + result[i];
            result[i] = val % 10;
            result[i + 1] = val / 10;    // A[i] + B[i] 한 값이 10을 넘으면 result[i+1]에 십의 자리수를 더해준다.
        }

        StringBuilder sb = new StringBuilder();

        // result[maxLen]이 0이 아니면, 즉 A와 B를 더했을때 overflow가 발생했으면 해당 값을 sb에 append한다.
        if(result[maxLen] != 0) {
            sb.append(result[maxLen]);
        }

        // 출력을 위해 result의 값을 마지막 인덱스부터 sb에 append한다.
        for(int i = maxLen - 1; i >= 0; i--) {
            sb.append(result[i]);
        }

        System.out.println(sb);
    }
}

// BigInteger 클래스 사용 방식과 직접 구현 방식 비교
// BigInteger 클래스는 문자열 검사, 음수와 양수 검사 등 거쳐야 하는 과정이 많아
// BigInteger 클래스를 사용하는 방식의 경우 직접 구현 방식보다 시간이 오래 걸린다.
// + 출력 시 요소 하나씩 출력하는 것은 매우 비효율적이기 때문에 StringBuilder를 사용하는 것이 좋다.