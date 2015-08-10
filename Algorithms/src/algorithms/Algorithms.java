/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;

/**
 *
 * @author ebaibourine
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utils utils = new Utils();
        BinarySearch bs = new BinarySearch();
        
        
        int[] sortedArray = utils.createArray(25, false, 1, 100);
        int target = 50;
        int indexArray = bs.binarySearchImpl(sortedArray, target);
        
        System.out.println("Testing binary search");
        System.out.println("Here is the array");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Here is the answer");
        System.out.println(indexArray);
    }
    
}
