/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial4;

/**
 *
 * @author Nem
 */
public class Math {

    /**
     * Consider whether a number is prime number or not
     * @effect<pre>
     *          if a<=0 return false
     *          else if a = 1 return true
     *          else
     *              ifa%i = 0 count = count + 1
     *              if count = 2
     *                  return true
     *              else return false</pre>
     * @param a
     * @return boolean value
     */
    private boolean isPrime(int a) {
        if (a <= 0) {
            return false;
        } else if (a == 1) {
            return true;
        } else {
            int count = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    /**
     * Test all procedures of class
     * @effects<pre>
     *              Switch some cases to chose
     *              Execute each procedure
     *  {@link isPrime(int a)}: Consider an number is negative or not
     * </pre>
     * @param args 
     */
    public static void main(String[] args) {
        
    }
}
