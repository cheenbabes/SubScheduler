/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ebaibourine
 */
public class Utils {
    
    public int[] createArray(int size, boolean isRandom, int min, int max){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        
        for(int i=0; i<size; i++){
            list.add(r.nextInt((max-min) +1) + min);
        }
        
        if(isRandom){
            return convertIntegers(list);
        }
        else{
           Collections.sort(list);
           return convertIntegers(list);
        }
    }
    
    private static int[] convertIntegers(List<Integer> integers){
        int[] ret = new int[integers.size()];
        for (int i=0; i< ret.length; i++){
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
}
