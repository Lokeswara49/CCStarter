class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<100;i++)
            System.out.println("Thread1");
    }
}
class Thread2 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread2");
        }
    }
}
class Thread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread3");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.start();
        Thread2 t2=new Thread2();
        t2.start();
        Thread t3=new Thread(new Thread3());
        t3.start();
    }
}
