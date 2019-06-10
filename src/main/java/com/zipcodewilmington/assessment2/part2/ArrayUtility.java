package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Integer i : array1) {
            arr.add(i);
        }
        for (Integer i : array2) {
            arr.add(i);
        }

        Integer[] returnarr = new Integer[arr.size()];
        returnarr = arr.toArray(returnarr);

        return returnarr;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
//        Integer[] newArr = new Integer[array.length];
//
//        for (int i = 0; i < index; i++) {
//            for (int j = array.length - 1; j > 0; j--) {
//                int temp = array[j];
//                newArr[j] = array[j - 1];
//                newArr[j - 1] = temp;
//            }
//        }
//        return array;

        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer count = 0;
        for (Integer i : array1 ){
            if (i.equals(valueToEvaluate)) count++;
        }
        for (Integer i : array2 ){
            if (i.equals(valueToEvaluate)) count++;
        }
        return count;
    }


    public Integer mostCommon(Integer[] array) {
        int count = 0;
        Integer mostCommon = array[0];
        int tempCpount;
        Integer tempnum;
        for (int i = 0; i <array.length-1 ; i++) {
            tempnum = array[i];
            tempCpount = 0;
            for (int j = 0; j <array.length -1 ; j++) {

                if (tempnum == array[j]) {
                    tempCpount++;
                }
            }
            if (tempCpount > count) {
                count =tempCpount;
                mostCommon = tempnum;
            }
        }
        return mostCommon;
    }
}
