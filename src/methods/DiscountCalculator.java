package methods;

public class DiscountCalculator {
    static double max(double ...A) {
        if (A.length == 0) {
            return 0;
        }

        else {
            double sum=0;
            for (double X:A) {
                sum=sum+X;
            }
            if (sum>500)
                return (sum*0.10);
            else if (sum>300 && sum<500)
                return (sum*0.05);
            else
                return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(100, 200, 300, 400));
    }
}
