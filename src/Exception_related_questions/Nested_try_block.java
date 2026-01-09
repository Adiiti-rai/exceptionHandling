// nested try block

package Exception_related_questions;
import java.util.*;
public class Nested_try_block {
    public static void main(String[] args){
        try{
            try{
                int arr[]={20,10,30,40};
                System.out.println("print the element:"+arr[7]);
            }
            catch(Exception e){
                System.out.println("print the exception name:"+e);
            }
            int a=2;int b=1;int c;
            c= a/b;
            System.out.println("print the value of c:"+c);
        }
        catch(Exception e){
            System.out.println("which type of exception occurs"+e);
        }
    }
}
