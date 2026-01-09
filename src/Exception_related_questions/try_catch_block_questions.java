
// one try and multiple catch block
package Exception_related_questions;
import java.util.*;
public class try_catch_block_questions {
    public static void main(String[] args) {
        try {
            int a=10,b=0,c;
            c= a/b;
            System.out.println("print the element:"+c);

            int arr[] = {10, 20, 30, 40, 50};
            System.out.println("print the array element:" + arr[8]);
            
            String str= "Aditi";
            System.out.println(str.toUpperCase());
        }
        catch(ArithmeticException e){
            System.out.println("This represent Arithmetic operation");
        }
        catch(NullPointerException e){
            System.out.println("It shows the null pointer exception");
        }
        catch(Exception e){
            System.out.println("any type of exception");
        }
    }
}
