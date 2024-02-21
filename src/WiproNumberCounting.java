import java.util.Scanner;

public class WiproNumberCounting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        String ans="";
        for(int i=0;i<s1.length;i++){
            //System.out.println(s1[i]);
            if(s1[i].equals("of")) {
                ans+="ok ";
            }
            else{
                ans+=s1[i]+" ";
            }
        }
        System.out.println(ans);
    }
}
