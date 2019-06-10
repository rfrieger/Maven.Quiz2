package com.zipcodewilmington.assessment2.part2;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListUtility{
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<String> string = new ArrayList<>();

    public Boolean add(int i) {

        arr.add(i);

        if (arr.contains(i)) {
            return true;
        } else return false;

    }

    public Integer size() {
       return arr.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (!arrayList.contains(arr.get(i))) {
                arrayList.add(arr.get(i));
            }
        }
        return arrayList;
    }

    public String join() {
       String string = "";
       if (arr.size() == 1) {
           for (Integer i : arr) {
               string += i;
           }
       }else {
           for (int i = 0; i <arr.size() -1 ; i++) {

                   string += arr.get(i) +", ";
               }
               string += arr.get(arr.size()-1);
           }
        return string;
       }




    public Integer mostCommon() {
        ArrayUtility au =  new ArrayUtility();

        int count = 0;
        Integer mostCommon = arr.get(0);
        int tempCpount;
        Integer tempnum;
        for (int i = 0; i <arr.size()-1 ; i++) {
            tempnum = arr.get(i);
            tempCpount = 0;
            for (int j = 0; j <arr.size() -1 ; j++) {

                if (tempnum == arr.get(j)) {
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


    public Boolean contains(Integer valueToAdd) {
        if (arr.contains(valueToAdd)) {
            return true;
        }else return false;
    }
}
