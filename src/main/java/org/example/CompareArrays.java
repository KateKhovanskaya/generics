package org.example;

public class CompareArrays <T>{
//    private T[] arr1;
//    private T[] arr2;
//    public CompareArrays(T[] arr1, T[] arr2){
//        this.arr1 = arr1;
//        this.arr2 = arr2;
//    }
    public boolean compareArrays(T[] arr1, T[] arr2){
        if(arr1.length == arr2.length && arr1[0].getClass()==arr2[0].getClass()) return true;
        return false;
    }
}
