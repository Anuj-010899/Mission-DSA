package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={9 ,9 ,9 ,9, 9 ,9};

        int largest=0,secLargest=-1;

        for(int i=1;i< arr.length;i++){
            if(arr[i]>arr[largest]){
                secLargest=largest;
                largest=i;
            }else if(arr[i]<arr[largest]){

                if(secLargest==-1|| arr[i]>arr[secLargest]){
                    secLargest=i;
                }
            }
        }

        System.out.println(arr[secLargest]);



    }
}
