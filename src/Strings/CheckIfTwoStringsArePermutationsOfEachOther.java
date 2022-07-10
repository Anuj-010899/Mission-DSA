package Strings;

public class CheckIfTwoStringsArePermutationsOfEachOther {
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        String str2="forgeeksgeeks";

        String temp=str1+str1;

        if(temp.indexOf(str2)>-1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
