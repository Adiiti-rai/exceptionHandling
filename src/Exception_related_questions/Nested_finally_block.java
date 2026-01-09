//nested finally block...

package Exception_related_questions;
import java.util.*;
public class Nested_finally_block {
    public static void main(String[] args){
        try{
            int a=10,b=0,c;
            c=a/b;
            System.out.println("print the value of the c:"+c);
        }
        catch(Exception e){
            System.out.println("print the exception name:"+e);
        }
        finally{
            try{
                String str= "Aditi";
                System.out.println(Integer.parseInt(str));
            }
            catch(Exception e){
                System.out.println("tell me the exception name"+ e);
            }
            finally{
                System.out.println("print the finally block");

            }
        }
        System.out.println("end of the main method");

    }
}
