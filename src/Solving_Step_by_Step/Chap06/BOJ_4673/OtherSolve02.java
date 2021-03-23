package Solving_Step_by_Step.Chap06.BOJ_4673;

import java.util.HashSet;

public class OtherSolve02 {
    public static int d(int num) {
        int sum = num;
        while(num != 0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i <= 10000; i++) {
            set.add(d(i));
            if(!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
