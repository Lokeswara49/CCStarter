import java.util.Scanner;
class Item1 {
    int id;
    int quantity;
    String name;
    int price;
    public void id_value(int id){
        this.id=id;
    }
    public int id_value(){
        return id;
    }
    public void quantity_value(int quantity){
        this.quantity=quantity;
    }
    public int quantity_value(){
        return quantity;
    }
    public void name_value(String name){
        this.name=name;
    }
    public String name_value(){
        return name;
    }
    public void price_value(int price){
        this.price=price;
    }
    public int price_value(){
        return price;
    }
}
public class Main
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no_of_item=sc.nextInt();
        Item1 o[]=new Item1[no_of_item];
        for(int i=0;i<no_of_item;i++){
            int id=sc.nextInt();
            int quantity=sc.nextInt();
            String s=sc.nextLine();
            String name= sc.nextLine();
            int price=sc.nextInt();
            Item1 temp=new Item1();
            temp.id_value(id);
            temp.quantity_value(quantity);
            temp.name_value(name);
            temp.price_value(price);
            o[i]=temp;
        }
        int req=sc.nextInt();
        System.out.println(Main.findItemWithMaximumPrice(o));
        Item1 t=Main.searchItemById(o,req);
        System.out.println(t.id);
        System.out.println(t.quantity);
        System.out.println(t.name);
        System.out.println(t.price);
    }
    public static int  findItemWithMaximumPrice(Item1 item_obj[]){
        int maxi=Integer.MIN_VALUE;
        for(Item1 val:item_obj){
            if(maxi<val.price){
                maxi=val.price;
            }
        }
        return maxi;
    }
    public static Item1 searchItemById(Item1 item_obj[], int id){
        for(Item1 val:item_obj){
            if(val.id==id){
                return val;
            }
        }
        return null;
    }
}
