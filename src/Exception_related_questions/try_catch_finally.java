//try-catch-finally
package Exception_related_questions;

public class try_catch_finally {
    public static void main(String[] args) {

        int a = 10;
        //int b = 2;
        int b=0;

        try {
            System.out.println("learn coding");
            int c = a / b;
            System.out.println("print c: " + c);
            System.out.println("Aditi Rai");
        }
        catch(Exception e){

//            int x=5;int y=0;
//            int z=x/y;
//            System.out.println(z);
            System.out.println("can not divide by zero");
        }

        finally {
//            int x1=5;int y1=0;
//            int c1=x1/y1;
//            System.out.println(c1);
            System.out.println("Ankit");
        }

        System.out.println("program has been ended");
    }
}
