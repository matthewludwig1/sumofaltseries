/*
    Matt Ludwig
    2019-09-11
    This program 
 */
package alternatingsum;

/**
 *
 * @author mattludwig6@gmail.com
 */
public class Alternatingsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int k = 500; // number of iterations
        double sum;
        sum = 0;
        for (int n = 1; n <= k; n++) {
            sum = 4 + (Math.pow(-1, n))*((double)4/(1+(2*n)));
        }
        System.out.println(sum);
    } 
}
