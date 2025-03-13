package org.LLD.DesignPatterns.Regsitry.Concept;

import org.LLD.DesignPatterns.Prototype.Concept.NormalStudent;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, NormalStudent> studentMap = new HashMap<>();

    public void register(String key,NormalStudent student){
        studentMap.put(key,student);
    }

    public NormalStudent get(String key){
        ///  If we need singleton object then dont use copy
        return studentMap.get(key).copy();
    }
}
