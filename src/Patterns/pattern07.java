/* Output
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

package Patterns;

public class pattern07 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i<=5; i++)
        {
            for (int j = 1; j <=i; j++)
            {
                ++count;
                System.out.format("%02d ", count);
            }
            System.out.println();
        }
    }
}
