import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Infosys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> a=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x= sc.nextInt();
            a.add(x);
        }
        System.out.println(maxPosPrefixes(a));
    }
    static int maxPosPrefixes(List<Integer> arr){
        int sum=0;
        int ans=1;
        Collections.sort(arr);
        int i=arr.size()-2;
        sum+=arr.get(arr.size()-1);
        while (i>=0){
            sum+=arr.get(i);
            if(sum<=0){
                break;
            }
            ans++;
            i--;
        }
        return ans;
    }
}
