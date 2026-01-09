// Throwable->Exception->RuntimeException->NullPointerException

package Exception_related_questions;

public class NullPointerEXception {
    public static void main(String[] args){
        //String str= null;
        String str= "Aditi"; // if in your program do not have any exception but you write the
        // try catch block part to esase fark nhi padta h.
        //null is a reserved keyword in java and you can use it as a literal.
        // null don't have any cast like upper,lower nothing.
       try{
           System.out.println(str.toUpperCase());
       }
       catch(Exception e){
           System.out.println(e);
       }
        System.out.println("end of the program");
    }
}
