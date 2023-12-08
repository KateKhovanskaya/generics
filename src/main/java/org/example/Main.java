package org.example;

import java.io.DataInputStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        DataInputStream v = new DataInputStream(System.in);
//        GenericClass<String, DataInputStream, Integer> genObj = new GenericClass<>("Строка", v, 5);
//        genObj.printTypes();
//        Number[] numArray = new Number[3];
//        numArray[0] = 2;
//        numArray[1] = 2.1f;
//        MyList<Number> myList= new MyList(numArray);
//        myList.printList();
//        System.out.println("Size: " + myList.getSize());
//        System.out.println("length: " + myList.getSize());
//        for (Number num:myList) {
//            System.out.println(num);
//        }
        Calculator calc = new Calculator();
        Long a = 3l;
        Short b = 4;
        Calculator.sum(a,b);
        Calculator.multiply(a,b);
        Calculator.divide(a,b);
        Calculator.subtract(a,b);

        Number divide = Calculator.sum1(a,b);

        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {8,2,5};
        String[] str1 = {"1", "2", "3", "4"};
        String[] str2 = {"1", "2", "3", "4"};
        CompareArrays compareArrays = new CompareArrays<>();
        System.out.println(compareArrays.compareArrays(str1, arr2));

        Pair pair1 = new Pair<Integer, String>(1, "one");
        System.out.println(pair1.toString());
    }
}