package methods;

public class PrimeNumber {

    static boolean PrimeNumberChecker(int number) {

        for (int i=2; i<(number/2); i++) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 10;

        if (PrimeNumberChecker(num)) {
            System.out.println(num+" is a Prime Number.");
        }
        else {
            System.out.println(num+" is not a Prime Number.");
        }
    }
}
