import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Recursion_Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s="ABCD";
        Set<Character> set=new HashSet<>();
        findPermutations(s,set,0,"");

    }
    static void findPermutations(String s, Set<Character> set,int i,String temp){
        if(i==s.length()){
            System.out.println(temp);
        }
        else{
            for(int j=0;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    String x=temp+s.charAt(j);
                    set.add(s.charAt(j));
                    findPermutations(s,set,j+1,x);
                    set.remove(s.charAt(j));
                    System.out.println("Hello");
                    findPermutations(s,set,j+1,temp);
                }
            }
        }

    }
}
