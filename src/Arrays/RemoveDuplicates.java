package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,1,2};
        int i=0;
        for(int k=1;k< arr.length;k++){
            if(arr[k]==arr[i]){
                continue;
            }else{
               i++;
               arr[i]=arr[k];
            }
        }

        System.out.println(i);
    }
}
