package Arrays;

public class ThirdLargestElementInArray {
    public static void main(String[] args) {
        int arr[]={5,2,2};

        int l=0;
        int sl=-1;
        int tl=-1;

        for(int i=1;i< arr.length;i++){
            if(arr[i]>arr[l]){
                tl=sl;
                sl=l;
                l=i;
            }else if(arr[i]<arr[l]){
                if(sl==-1|| (arr[i]>arr[sl] )){

                    tl=sl;
                    sl=i;
                }else if(tl==-1 || (arr[i]>arr[tl])){
                    if(arr[i]==arr[sl]) continue;
                    tl=i;
                }
            }
        }

        System.out.println(tl);
    }
}
