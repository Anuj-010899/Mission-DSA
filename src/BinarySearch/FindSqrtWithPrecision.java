package BinarySearch;
import java.util.Scanner;

public class FindSqrtWithPrecision {
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
            }else if(mid*mid<num){
                ans=mid;
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
    static  double sqrtPrecision(int sqrt,int num,int precision){
        double factor=1;
        double ans=sqrt;
        for(int i=0;i<precision;i++){
            factor=factor/10;
            for(double j=ans;j*j<num;j=j+factor){
                ans=j;
                System.out.println(j +" "+factor);
            }

            System.out.println("next iteration");
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num=sc.nextInt();
        int precision= sc.nextInt();

        int sqrt=findSqrt(num);
        double ans=sqrtPrecision(sqrt,num,precision);

        System.out.println(ans);
        


    }
}
