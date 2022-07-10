package Arrays;

public class RemoveDuplicatesFromSortedArray02 {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,2,4,4,4,5,5,5,5,6,7,8,8,8};

        int i=0;
        int count=0;
        for(int j=1;j< arr.length;j++){
            if(arr[j]==arr[i]){
                count++;

                if(count>=2){
                    continue;
                }else{
                    i++;
                    arr[i]=arr[j];
                }

            }else{

                i++;
                arr[i]=arr[j];
                count=0;
            }
        }

        for(int m:arr){
            System.out.print(m+" ");
        }
    }
}
