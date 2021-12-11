// This class is imported in exception08
package ExceptionHandling;

public class exception07 extends Exception {
    public String getMessage() {
        String error = "Balance is less than 1500. You cannot withdraw money";
        return error;
    }
}
