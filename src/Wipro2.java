import java.util.Scanner;

public class Wipro2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int res=0;
        for(int i=0;i<s.length();i++){
            if(!((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9') || s.charAt(i)==' ')){
                res++;
            }
        }
        System.out.println(res);
    }
}
