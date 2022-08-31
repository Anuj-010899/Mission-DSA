package Recursion;

public class Factorial {
    private static int factorial(int n){
        if(n==0)
            return 1;
//        int smallerProblem=factorial(n-1);
//        int biggerProblem=n * smallerProblem;
//
//        return biggerProblem;
        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        int n=3;

        int fact=factorial(n);
        System.out.println(fact);
    }
}
