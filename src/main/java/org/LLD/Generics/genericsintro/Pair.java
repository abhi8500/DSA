package org.LLD.Generics.genericsintro;

public class Pair<V,S> {

    private V first;
    private S second;

    public Pair(V first,S second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(V first){
        this.first = first;
    }

    public V getFirst(){
        return this.first;
    }

    public void setSecond(S second){
        this.second = second;
    }

    public S getSecond(){
        return this.second;
    }


    /// Generic Method
    public static <T> T doSomething(T val){
        return val;
    }


}
