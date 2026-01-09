//  Throwable->Exception->RuntimeException->ArithmeticException

package Exception_related_questions;

public class ArithmeticException extends Throwable {

    public static void main() {
        int a = 10;
        int b = 0;
        int c;
        try { // if we exception does not occur then only executed try block ,catch block does not occur.
            c = a / b;
            System.out.println("print the c:"+c);
        }
        catch (Exception e) { // agr exception occur hoga tabhi catch block executed hoga otherwise nhi.
            System.out.println(e);
        }
        System.out.println("program has been ended");
    }
    }

