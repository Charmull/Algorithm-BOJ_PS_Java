package Solving_Step_by_Step.Chap07.BOJ_11654;

import java.io.IOException;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        int num = System.in.read();
        System.out.println(num);
    }
}

// java 입력관련 클래스 공부하기(https://st-lab.tistory.com/41?category=830901)

// BufferedReader나 Scanner를 쓰는 것은 String으로 입력 받아서, char로 변환한 후, int 타입 변수에 문자에 대응되는 아스키 코드 값을 저장하는 방식.
// 즉, 쓸데없이 돌아가고 있다. -> 성능 down
// 결국 입력받은 문자 1개에 대한 아스키코드 값만 출력하면 되기 때문에(한글은 입력받지 않으므로), System.in을 이용해 byte 형으로 문자 한 개만 읽어주면 된다.
// 이렇게 하면 3단계에 걸칠 일을(BufferedReader나 Scanner 사용할 때) 1단계로 해결 가능하다.