package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.HashSet;

public class Router {
    HashMap<String, String> hm = new HashMap<>();


    public void add(String path, String controller) {
        hm.put(path,controller);
    }

    public Integer size() {
        return hm.size();
    }


    public String getController(String path) {
        return hm.get(path);
    }

    public void update(String path, String studentController) {
        hm.replace(path, studentController);
    }

    public void remove(String path) {
        hm.remove(path);
    }
}
