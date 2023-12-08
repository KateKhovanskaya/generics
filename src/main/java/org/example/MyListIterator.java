package org.example;

import java.util.Iterator;

public class MyListIterator<T> implements Iterator<T> {
    int index;
    MyList<T> myList;
    public MyListIterator(MyList<T> myList){
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
