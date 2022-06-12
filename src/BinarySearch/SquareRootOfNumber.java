package BinarySearch;
import java.util.Scanner;

public class SquareRootOfNumber {
    static int findSqrt(int num){
        int s=0;
        int e=num;
        int mid=s+(e-s)/2;
        int ans=-1;

        while(s<=e){
            if(mid*mid==num){
                return mid;
            }else if(mid*mid>num){
                e=mid-1;
            }else if(mid*mid<num){//[1,2,4,6,7,8] num=36
                ans=mid;
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int sqrt=findSqrt(num);

        System.out.println(sqrt);
    }
}
