package Recursion;

public class squareRootOfNumberWithPrecision {
    private static int sqrt(int n,int s,int e,int ans){
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;

        if(mid*mid==n){
            return mid;
        }else if(mid * mid >n ){
            return sqrt(n,s,mid-1,ans);
        }else{
            ans=mid;
            return sqrt(n,mid+1,e,ans);
        }

    }

    private static float  sqrtPrecision(int sqrt, int n, int precision) {
         double squareRoot= sqrt;
         double factor=  0.1;
        for(int i=0;i<precision;i++){
            while(squareRoot*squareRoot<=n){
                squareRoot+=factor;
            }
            squareRoot=squareRoot-factor;// Since while loop is breaking when it is greatee than n
            factor/=10;
        }
        return (float) squareRoot;
    }
    public static void main(String[] args) {
        int n=6;
        int precision=5;
        int ans=-1;

        int sqrt=sqrt(n,0,n,ans);
        System.out.println("The square root of "+n+" is: "+ sqrtPrecision(sqrt,n,precision) );
    }

}
