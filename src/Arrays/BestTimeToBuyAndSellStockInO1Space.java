package Arrays;

public class BestTimeToBuyAndSellStockInO1Space {
    public static void main(String[] args) {
        int arr[]={3,1,4,8,7,2,5};

        int minSoFar=arr[0];
        int maxProfit=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]<minSoFar){
                minSoFar=arr[i];
            }
            if(arr[i]-minSoFar>maxProfit){
                maxProfit=arr[i]-minSoFar;
            }
        }
        System.out.println(maxProfit);
    }
}
