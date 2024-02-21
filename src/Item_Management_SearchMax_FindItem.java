import java.util.Scanner;

class Item{
    int id;
    int quantity;
    String name;
    int price;
    Item(int id,int quantity,String name,int price){
        this.id=id;
        this.quantity=quantity;
        this.name=name;

        this.price=price;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price ;
    }
}

public class Item_Management_SearchMax_FindItem {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        Item[] items=new Item[n];
        for(int i=0;i<n;i++){
            int id= sc.nextInt();
            int quantity= sc.nextInt();
            String name=sc.next();
            int price=sc.nextInt();
            Item item=new Item(id,quantity,name,price);
            items[i]=item;
        }
        int itemId= sc.nextInt();
        System.out.println(findItemithMaxPrice(items,itemId));
        Object x=searchItemById(items,itemId);
        if(x==null)
            System.out.println("Not found");
        else{
            System.out.println(x);
        }

    }
    static Object findItemithMaxPrice(Item[] items, int itemId){
        int index=-1;
        int max=0;
        for(int i=0;i<items.length;i++){
            if(items[i].price>max){
                max=items[i].price;
                index=i;
            }
        }
        return items[index];
    }
    static Object searchItemById(Item[] items, int itemId){
        int index=-1;
        for(int i=0;i<items.length;i++){
            if(items[i].id==itemId){
                index=i;
                break;
            }
        }
        if(index==-1){
            return null;
        }
        return items[index];
    }
}
