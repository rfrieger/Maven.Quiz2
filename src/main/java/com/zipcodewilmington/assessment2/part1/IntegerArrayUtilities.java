package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2 == 0) {
            return true;
        }else  return false;
    }



    public Integer[] range(int start, int stop) {
        Integer[] intArr = new  Integer[stop - start + 1];
        int count =0;
        for (int i = start; i <=stop ; i++) {
            intArr[count] = i;
            count++;
        }
        return intArr;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length -2] * array[array.length -1];
    }
}
