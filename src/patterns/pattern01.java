/* Output
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
 */
package patterns;

public class pattern01 {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++)
        {
            for (int j = 1; j <=5; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
