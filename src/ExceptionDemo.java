public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            throw new RuntimeException("Hello");
        }
        finally {
            System.out.println("came");
            //return;
        }
       // System.out.println("a is : ");
    }

    public static void test (){
        try{
            throw new RuntimeException("Hello");
        }
        finally {
            System.out.println("came");
            return;
        }
    }
}
