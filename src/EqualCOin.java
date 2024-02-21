import java.util.Scanner;

public class EqualCOin {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t= sc.nextInt();
            while (t-->0){
                long X= sc.nextLong();
                long Y= sc.nextLong();
                if((X%2==0 && Y%2==0) || ((X%2==0 && Y%2==1)&& X!=0)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        catch (Exception e){
            return;
        }
    }
}
