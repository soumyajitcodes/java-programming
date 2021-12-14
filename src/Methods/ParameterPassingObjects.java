package Methods;

public class ParameterPassingObjects {

    static void change(int A[], int index, int value) {
        A[index] = value;
    }

    public static void main(String[] args) {
        int ARRAY[] = {2, 4, 6, 8, 10};
        change(ARRAY, 2, 25);

        for (int X:ARRAY) {
            System.out.print(X+" ");
        }
        System.out.println();
    }

}
