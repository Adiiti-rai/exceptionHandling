//Throwable->Exception->RuntimeException->NumberFormatException.

package Exception_related_questions;

public class NumberFormatException {
    public static void main(String[] args){
        //String str= "Aditi";
        String str= "123";
        try{
        int a= Integer.parseInt(str);
        //convert string into primitive int so use parseInt()and valueOf()
        //int a= Integer.valueOf(str);
        System.out.println("convert the string into the int:"+a);
    }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("program has been ended");

        }
}
