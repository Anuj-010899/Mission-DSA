package Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        //Transpose Matrix
        for(int i=0;i< arr[0].length;i++){
            for(int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //Rotate Matrix 90 degree clockwise
            // Step-1 Transpose Matrix
            // Step-2 Reverse elements in every row
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-j-1];
                arr[i][arr.length-j-1]=temp;
            }
        }

        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
