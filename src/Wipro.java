import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Wipro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        Map<String,Integer> m=new HashMap<>();
        String[] s1=s.split(" ");
        for(int i=0;i<s1.length;i++){
            if(m.containsKey(s1[i])){
                m.replace(s1[i],1+m.get(s1[i]));
            }
            else{
                m.put(s1[i],1);
            }
        }
        m.forEach((key,v)->{
            if(v>=k){
                System.out.print(key+" ");
            }
        });
    }
}
