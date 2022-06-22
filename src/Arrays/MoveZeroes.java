package Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int arr[]={2,0,0,3,4,5,6,0,7,0,0,0};
        int len= arr.length;
        int ans[]=new int[len];

        int i=0;
        int j=len-1;

        for(int k=0;k<len;k++){
            if(arr[k]>0){
                ans[i]=arr[k];
                i++;
            }else{
                ans[j]=arr[k];
                j--;
            }
        }

        for(int l:ans){
            System.out.print(l+" ");
        }



    }
}
