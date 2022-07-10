package BinarySearch;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num=1;
        int s=0;
        int e=num;

        int mid=s+(e-s)/2;
        while(s<=e){
            if(mid*mid==num){
                System.out.println("Valid");
            }
            if(mid*mid>num){
                e=mid-1;
            }else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }

        System.out.println("Out Of Loop");
    }
}
