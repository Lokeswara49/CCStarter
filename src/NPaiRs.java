import java.util.Calendar;
import java.util.Scanner;

public class NPaiRs {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t= sc.nextInt();
            while (t-->0){
                int N= sc.nextInt();
                String s1= sc.nextLine();
                String s= sc.nextLine();
                int ans=0;
                System.out.println(s);
                for(int i=0;i<N;i++){
                    for(int j=i+1;j<i+1+9 && j<N;j++){
                        if((j-i)==Math.abs(s.charAt(i)-s.charAt(j))){
                            ans++;
                        }
                    }
                }
                System.out.println(ans);
            }
        }
        catch (Exception e){
            return;
        }
    }
}
