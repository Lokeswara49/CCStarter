class Parent {
    //public abstract int demo();
    public int hello;
    public void m2(){
        System.out.println("m2Hello");
    }

}
class Derieved extends Parent{
    public int demo() {
        System.out.println("Hii");
        return 10;
    }
    public void m1(){
        System.out.println("hello");
    }
}
public class AbstractClass{
    public static void main(String[] args) {
        Derieved var=new Derieved();
        //Parent var1=new Parent();
        Parent var2=new Derieved();
        //Derieved x1=new Parent();
        //int x=var2.demo();
        var2.m2();
        var.m1();
        //var2.m1();
    }
    }

