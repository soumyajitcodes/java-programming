/*   *
    ***
   *****
  *******
 */
package patterns;

public class pattern11 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++) {
                if (i+j>5) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=i+1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
