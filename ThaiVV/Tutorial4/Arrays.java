/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial4;

import java.util.Collections;

/**
 *
 * @author Nem
 */
public class Arrays {

    /**
     * Test all procedures in the class
     *
     * @effects<pre>
     *          Get several numbers from user
     *          Initialize an array from these numbers
     *          Give some options 
     * {@link userlibs#TextIO}: print text and get data from users 
     * {@link countNegative(int[] array)}: count the number of negative numbers
     * {@link }</pre>
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * Count the number of negative numbers of an array
     *
     * @effects<pre>
     *          for each Integer i in array, if i < 0, count++
     *              return count
     * </pre>
     *
     * @param array
     * @return the number of negative numbers of array
     */
    public int countNegative(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Find the min number of an array
     *
     * @effects<pre>declare a number min, if array[i]<=min, min = array[i]
     *                  return min
     *          </pre> @param array
     *
     * @return the min number of array
     */
    public int min(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Consider whether an array is ascending sorted or not
     *
     * @effects<pre>
     *          if array[i] <= array[i+1]
     *              return true
     *          else
     *              return false</pre> @param array @return boolean value
     */
    public boolean isAscSorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[i + 1]) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Inform the frequency of each elements of an array
     * @effect<pre>
     *      Sort array in ascending order
     *          if array[i] = array[j]
     *              if(i>0)
     *                  if array[i] = array[i - 1]
     *                      break;
     *                  count = count + 1
     *      Show information
     *                  </pre>
     *  {@link java#util#Arrays#sort(int[] array)}
     * @param array 
     */
    public void freq(int[] array) {
        java.util.Arrays.sort(array);

        Outer:
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            Inner:
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (i > 0) {
                        if (array[i] == array[i - 1]) {
                            continue Outer;
                        }
                    }
                    count++;
                }
            }
            System.out.println("Element " + array[i] + " appears " + count + " time(s).");
        }
    }
    
    
}
