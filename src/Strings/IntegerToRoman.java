package Strings;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num=9;
        String ans="";
        String[] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};

//        int i=0;

        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                num=num-value[i];
                ans+=symbol[i];
            }
        }
        System.out.println(ans);

    }
}
