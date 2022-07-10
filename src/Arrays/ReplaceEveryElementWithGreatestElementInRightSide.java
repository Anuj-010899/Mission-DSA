package Arrays;
import java.math.*;

public class ReplaceEveryElementWithGreatestElementInRightSide {
    static int maxi(int arr[],int s){
        int max=Integer.MIN_VALUE;
        for(int i=s;i< arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={17,18,5,4,6,1};

         arr[0]=maxi(arr,1);

        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>=arr[i-1]){

                arr[i]=maxi(arr,i+1);
            }else{
                arr[i]=arr[i-1];
            }

        }
        arr[arr.length-1]=-1;
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
