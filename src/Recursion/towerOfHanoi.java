package Recursion;

public class towerOfHanoi {
    private static long count=0;
    private static void toi(int n, int tower1, int tower3, int tower2) {
        if(n==0)
            return;

        toi(n-1,tower1,tower2,tower3);
        System.out.println("move disk "+n+" from rod "+tower1+" to rod "+tower3);
        count++;
        toi(n-1,tower2,tower3,tower1);
    }
    public static void main(String[] args) {
        int n=2;

        int tower1=1,tower2=2,tower3=3;

        toi(n,tower1,tower3,tower2);
        System.out.println(count);
    }


}
