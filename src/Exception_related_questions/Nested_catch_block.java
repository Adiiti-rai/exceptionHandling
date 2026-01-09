//Nested catch block
package Exception_related_questions;
import java.util.*;
public class Nested_catch_block {
    public static void main(String[] args){
        try{
            int a=10,b=2,c;
            c=a/b;
            System.out.println("print the value of c:"+c);

            int arr[]={10,20,30,40};
            System.out.println("print the error element:"+arr[3]);
        }
        catch(Exception e){
            System.out.println("tell me which type of exception in this statement:"+e);
            try{
                String str= null;
                System.out.println(str.toUpperCase());
            }
            catch(Exception e1){
                System.out.println("write the exception:"+e1);
            }
        }
        System.out.println("All is well");
    }
}
