import java.util.*;

public class Hii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nb = sc.nextInt();
        int g = sc.nextInt();
        System.out.println(fishPopulation(n, nb, g));
    }
    static Long fishPopulation(int n,int nb,int g){
        ArrayList<Long> a= new ArrayList<>();
        long z=nb;
        a.add(z);
        int index=0;
        int i=0;
        while(i<n){
            long ans=0;
            if(i>=4) {
                long y=a.get(i)-a.get(i-4);
                long x=y-a.get(i-2);
                ans=(x)*g;
                ans+=a.get(i);
                ans-=a.get(i-4);
                a.add(ans);
            }
            else if(i>=2){
                long x=a.get(i)-a.get(i-2);
                ans=(x)*g;
                ans+=a.get(i);
                a.add(ans);
            }
            else{
                ans=a.get(i)*g;
                ans+=a.get(i);
                a.add(ans);
            }
            i++;
        }
        return a.get(n);
    }
}
