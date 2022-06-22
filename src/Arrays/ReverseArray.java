package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={};
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;

            s++;
            e--;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
