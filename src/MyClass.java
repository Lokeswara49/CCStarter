import java.util.Scanner;

class Watch{
    int watchId;
    String watchName;
    double price;
    String brand;


    public Watch(int watchId, String watchName, double price, String brand) {
        this.watchId = watchId;
        this.watchName = watchName;
        this.price = price;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getWatchName() {
        return watchName;
    }

    public void setWatchName(String watchName) {
        this.watchName = watchName;
    }

    public int getWatchId() {
        return watchId;
    }

    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



}

public class MyClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Watch[] arr=new Watch[4];
        for(int i=0;i<4;i++){
            int watchId=sc.nextInt();
            String s=sc.nextLine();
            String watchName=sc.nextLine();
            double price=sc.nextDouble();
            s=sc.nextLine();
            String brand=sc.nextLine();
            Watch watch=new Watch(watchId,watchName,price,brand);
            arr[i]=watch;
        }
        String s=sc.nextLine();
        System.out.println(countWatchesByBrand(arr,s));

    }
    static int countWatchesByBrand(Watch[] a,String s) {
        s = toLower(s);
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            String s1 = toLower(a[i].brand);
            if (s1.equals(s)) {
                ans++;
            }
        }
        return ans;
    }
    static String toLower(String s){
        int i=0;
        String ans="";
        while(i<s.length()){
            if(Character.isUpperCase(s.charAt(i))){
               ans+=Character.toLowerCase(s.charAt(i));
            }
            else{
                ans+=s.charAt(i);
            }
            i++;
        }
        return ans;
    }
}
