package Java_Basic_Problem01.BOJ_9506;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();

            if(n == -1) {
                break;
            }

            ArrayList<Integer> arr = new ArrayList<>();

            int sum = 0;
            // 이 문제에서는 for문의 조건을 i < n으로 하는 것이 더 좋을 수도...(arr를 정렬해야돼서)
            // 정렬이 필요없다면 i*i <= n 로 하는것이 더 효율적임
            for(int i = 1; i*i <= n; i++) {
                if(n % i == 0) {
                    arr.add(i);
                    arr.add(n / i);
                    sum += (i + (n/i));
                }
            }

            arr.sort(null);

            if(sum - arr.get(arr.size()-1) == n) {
                System.out.printf("%d = ", n);
                for(int i = 0; i < arr.size(); i++) {
                    if(i == arr.size() - 2) {
                        System.out.printf("%d\n", arr.get(i));
                        break;
                    }
                    System.out.printf("%d + ", arr.get(i));
                }
            }
            else {
                System.out.printf("%d is NOT perfect.\n", n);
            }
        }
    }
}
