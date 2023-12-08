package org.example;

import java.util.Iterator;

public class MyList <T> implements Iterable<T>{
    private T[] array;
    private int size;
    private MyListInIterator myInIterator;
    public MyList(T[] array){
        this.array = array;
        size = array.length;
        myInIterator = new MyListInIterator(this);
    }
    public <E extends T> void addElement(T element) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length *2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[size] = element;
            array = (T[]) newArray;
        } else {
            array[size] = element;
        }
        size++;
    }
    public void removeElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null;
        size--;
    }
    public void printList(){
        for (T element:array) {
            System.out.print(element + " ");
        }
    }
    public int getSize(){
        return size;
    }
    public int getLength(){
        return array.length;
    }
    public T getElement(int index){
        return array[index];
    }
    public Iterator<T> iterator(){
        return myInIterator;
    }

    private class MyListInIterator<T> implements Iterator<T> {
        int index;
        MyList<T> myList;
        public MyListInIterator(MyList<T> myList){
            this.myList = myList;
        }

        @Override
        public boolean hasNext(){
            return index < myList.getLength();
        }
        @Override
        public T next(){
            return myList.getElement(index++);
        }
    }
}
