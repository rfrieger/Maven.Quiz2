package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer in;

    public WuTangConcatenator(Integer input) {
        this.in =input;
    }

    public Boolean isWu() {
        if (in % 3 == 0) {
            return true;
        }else  return false;
    }

    public Boolean isTang() {
        if (in % 5 == 0) {
            return true;
        }else  return false;
    }

    public Boolean isWuTang() {
        if (in % 15 == 0) {
            return true;
        }else  return false;
    }
}
