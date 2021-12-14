package Methods;

public class ReverseOverloading {

    static int reverse(int num) {
        int reversenum=0;
        while(num!=0) {
            reversenum = (reversenum*10)+(num%10);
            num = num/10;
        }

        return reversenum;
    }

    static int[] reverse(int[] num) {
        int reversenum[] = new int[num.length];
        int j = num.length;

        for (int i=0; i<num.length; i++) {
            reversenum[j-1] = num[i];
            j -= 1;
        }

        return reversenum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(102));
        System.out.println(reverse(new int[]{10, 20, 30, 40, 50}));
    }
}
