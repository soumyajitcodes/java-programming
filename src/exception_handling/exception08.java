package exception_handling;

public class exception08 {
    public static void main(String[] args) {
        try {
            throw new exception07();
        }
        catch (exception07 e) {
            System.out.println(e.getMessage());
        }
    }
}
