/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author ebaibourine
 */
public class BinarySearch {

    public int binarySearchImpl(int[] sortedArray, int target) {
        int min = 0;
        int max = sortedArray.length - 1;

        while (min < max) {
            int guess = (max - min) / 2;
            if (sortedArray[guess] < target){
                min = guess + 1;
            }
            else if(sortedArray[guess] > target){
                max = guess -1;
            }
            else{
                return guess;
            }
        }
        return -1;
    }
}
