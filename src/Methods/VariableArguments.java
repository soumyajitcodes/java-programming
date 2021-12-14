package Methods;

public class VariableArguments {

    static void showList1(int ...A) {
        for (int X:A) {
            System.out.print(X+" ");
        }
    }

    static void showList2(String ...A) {
        for (String X:A) {
            System.out.print(X+" ");
        }
    }

    static void showList3(int start, String ...A) {
        for (int x=0; x<A.length; x++) {
            System.out.print(start+" . "+A[x]+" ");
            start++;
        }
    }

    public static void main(String[] args) {
        showList1();
        System.out.println();

        showList1(10, 20, 30);
        System.out.println();

        showList2("RAM", "SAM", "BAJ");
        System.out.println();

        showList3(5, "RAM", "SAM", "BAJ", "MAR", "JAN", "MARK", "RDJ", "CAP", "THANOS");
        System.out.println();


    }
}
