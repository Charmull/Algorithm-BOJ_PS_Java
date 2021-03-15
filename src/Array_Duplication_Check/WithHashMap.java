package Array_Duplication_Check;

import java.util.HashMap;

// 배열 중복 횟수 및 값 확인하기(HashMap 사용)
public class WithHashMap {
    public static void main(String[] args) {
        int[] intArr = {5, 4, 3, 4, 4, 5, 1};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < intArr.length; i++) {
            if(map.containsKey(intArr[i])) {
                map.put(intArr[i], map.get(intArr[i]) + 1);
                // 위의 코드는 아래와 같음
                // int temp = map.get(intArr[i]);
                // temp++;
                // map.put(intArr[i], temp);
            }
            else {
                map.put(intArr[i], 1);
            }
        }

        System.out.println(map);
    }
}
