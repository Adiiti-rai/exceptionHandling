// multiple try catch block

package Exception_related_questions;
import java.util.*;
public class multiple_try_catch {
    public static void main(String[] args){
      try{
          int a=10,b=0,c;
          c=a/b;
          System.out.println("print the value of:"+c);
      }
      catch(Exception a)
          {
              System.out.println("can't divide by zero");
          }

      try{
          int arr[]={10,20,30,40};
          System.out.println("print the element:"+arr[5]);

      }
      catch(Exception e){
          System.out.println("element not available at given index");

      }
    }
}
