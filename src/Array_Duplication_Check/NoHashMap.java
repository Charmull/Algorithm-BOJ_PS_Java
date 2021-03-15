package Array_Duplication_Check;

import java.util.ArrayList;

// 배열 중복 횟수 및 값 확인하기(HashMap 사용X)
public class NoHashMap {
    public static void main(String[] args) {
        int[] intArr = {5, 4, 3, 4, 4, 5, 1};
        // Integer[]을 요소로 가지는 ArrayList 정의(2차원 ArrayList)
        ArrayList<Integer[]> countDuplicated = new ArrayList<Integer[]>();

        for(int i = 0; i < intArr.length; i++) {
            int len = countDuplicated.size();
            for(int j = 0; j < len; j++) {
                Integer[] arr = countDuplicated.get(j);
                if (arr[0] == intArr[i]) {
                    Integer[] temp = {arr[0], arr[1].intValue() + 1};
                    countDuplicated.set(j, temp);
                    break;
                }
                // 마지막 루프까지 arr[0] == intArr[i]이지 않을때
                else if (j == len - 1) {
                    Integer[] inputArr = {intArr[i], 1};
                    countDuplicated.add(inputArr);
                }
            }
            // 처음에 len은 0이므로, countDuplicated에 첫번째 요소는 직접 넣어줘야한다.
            Integer[] p = {intArr[i], 1};
            if(countDuplicated.size() == 0) {
                countDuplicated.add(p);
            }
        }
        // 결과 출력
        for(Integer[] s : countDuplicated) {
            System.out.println(s[0] + " " + s[1]);
        }
    }
}
