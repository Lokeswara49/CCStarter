import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumStreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> s=new ArrayList<>();
        for(int i=0;i<n;i++){
            s.add(sc.next());
        }
        System.out.println(maxStreak(n,s));
    }
    public static int maxStreak(int n,List<String> s){
        int ans=0;
        int temp=0;
        for(int i=0;i<n;i++){
            String s1=s.get(i);
            int j=0;
            boolean b=true;
            while(j<s1.length()){
                if(s1.charAt(j)=='N'){
                    b=false;
                    break;
                }
                j++;
            }
            if(b){
                temp++;
            }
            else{
                ans=Math.max(temp,ans);
                temp=0;
            }
        }
        return ans;
    }

}
