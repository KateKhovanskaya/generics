package org.example;

import java.io.DataInput;
import java.io.InputStream;

public class GenericClass <T extends Comparable, V extends InputStream & DataInput, K extends Number>{
    private T t;
    private V v;
    private K k;

    public GenericClass(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }
    public V getV(){
        return v;
    }
    public K getK(){
        return k;
    }
    public void printTypes(){
        System.out.println("T is a " + t.getClass().getSimpleName() + "\n" +
                "V is a " + v.getClass().getSimpleName() + "\n" +
                "K is a " + k.getClass().getSimpleName());
    }
}
