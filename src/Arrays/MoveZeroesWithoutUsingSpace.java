package Arrays;

public class MoveZeroesWithoutUsingSpace {
    public static void main(String[] args) {
        int arr[]={2,3,0,0,8,8,90,4,0,0,7};

        int nonZeroPos=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[nonZeroPos];
                arr[nonZeroPos]=temp;
                nonZeroPos++;
            }
        }

        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
