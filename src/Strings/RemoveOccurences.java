package Strings;

public class RemoveOccurences {
    public static void main(String[] args) {
        String s="daabcbaabcbc";
        String part="abc";
        int index=s.indexOf(part);

        while(index!=-1){
             s=s.substring(0,index)+s.substring(index+part.length());
             index=s.indexOf(part);
        }
        System.out.println(s);

    }
}
