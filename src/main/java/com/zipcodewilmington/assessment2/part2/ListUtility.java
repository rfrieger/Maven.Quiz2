package com.zipcodewilmington.assessment2.part2;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.List;

public class ListUtility{
    ArrayList<Object> arr = new ArrayList<>();

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
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return null;
    }
}
