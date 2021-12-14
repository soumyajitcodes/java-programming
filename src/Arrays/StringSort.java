package Arrays;

public class StringSort {
    public static void main(String[] args) {
        String ARRAY[] = {"JAVA", "PYTHON", "C", "ADA", "BASIC"};

        java.util.Arrays.sort(ARRAY);

        for (String X: ARRAY) {
            System.out.print(X+" ");
        }
    }
}
