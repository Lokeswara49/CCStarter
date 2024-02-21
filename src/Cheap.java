import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Cheap {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t= sc.nextInt();
            while(t-->0){
                int X= sc.nextInt();
                int Y= sc.nextInt();
                int A= sc.nextInt();
                int B= sc.nextInt();
                int K= sc.nextInt();
                X=X+K*(A);
                Y=Y+K*(B);
                if (X > Y ) {
                    System.out.println("DIESEL");
                }
                else if(X<Y){
                    System.out.println("PETROL");
                }
                else{
                    System.out.println("SAME PRICE");
                }

            }
        }
        catch (Exception e){
            return;
        }
    }
}
