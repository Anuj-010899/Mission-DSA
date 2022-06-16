package Arrays;

public class SwapAlternates {
    public static void main(String[] args) {
        int arr[]={1,3,2,7,11,8};

        int i=0,j=1;

        while(j<arr.length && i< arr.length){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i+=2;
            j+=2;
        }

        for(int k:arr){
            System.out.println(k);
        }

    }
}
