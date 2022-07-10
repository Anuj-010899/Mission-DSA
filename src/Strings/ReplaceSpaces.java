package Strings;

public class ReplaceSpaces {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Coding Ninjas Is A Coding Platform");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                str.replace(i,i+1,"@40");
            }
        }
        System.out.println(str);

    }
}
