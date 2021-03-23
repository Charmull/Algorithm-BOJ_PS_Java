package Solving_Step_by_Step.Chap06.BOJ_15596;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        Test t = new Test();
        long sum = t.sum(a);
        System.out.println(sum);
    }
}

class Test {
    long sum(int[] a) {
        long sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}