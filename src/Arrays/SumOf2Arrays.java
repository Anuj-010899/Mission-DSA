package Arrays;
import java.util.*;

public class SumOf2Arrays {
    public static void main(String[] args) {
        int arr1[]={1};
        int arr2[]={9,0};
        ArrayList<Integer> list=new ArrayList<Integer>();

        int i=arr1.length-1;
        int j=arr2.length-1;
        int carry=0;

        while(i>=0 && j>=0){
            int sum=arr1[i]+arr2[j]+carry;
            carry=sum/10;
            sum=sum%10;
            list.add(sum);
            i--;
            j--;
        }
        while(i>=0){
            int sum=arr1[i]+carry;
            carry=sum/10;
            sum=sum%10;
            list.add(sum);
            i--;
        }
        while(j>=0){
            int sum=arr2[j]+carry;
            carry=sum/10;
            sum=sum%10;
            list.add(sum);
            j--;
        }
        while(carry!=0){
            int sum=carry;
            carry=sum/10;
            sum=sum%10;
            list.add(sum);
        }
        Collections.reverse(list);
        list.forEach((l)-> System.out.print(l+" "));
    }
}
