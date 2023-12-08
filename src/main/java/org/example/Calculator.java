package org.example;

public class Calculator {
    public static Number sum1( Number firstNum, Number secondNum) throws RuntimeException{
        Number rezult;
        if (firstNum instanceof Double || secondNum instanceof Double) {
            rezult = Double.valueOf(firstNum.doubleValue() + secondNum.doubleValue());
        } else if (firstNum instanceof Float || secondNum instanceof Float) {
            rezult = Float.valueOf(firstNum.floatValue()+secondNum.floatValue());
        } else if (firstNum instanceof Long || secondNum instanceof Long) {
            rezult = Long.valueOf(firstNum.longValue()+ secondNum.longValue());
        } else rezult = Integer.valueOf(firstNum.intValue()+secondNum.intValue());
        System.out.println(rezult);
        return rezult;
    }
    public static <T extends Number> void sum( T firstNum, T secondNum) throws RuntimeException{
            if (firstNum instanceof Double || secondNum instanceof Double) {
                System.out.println(Double.valueOf(firstNum.doubleValue() + secondNum.doubleValue()));
            } else if (firstNum instanceof Float || secondNum instanceof Float) {
                System.out.println(Float.valueOf(firstNum.floatValue()+secondNum.floatValue()));
            } else if (firstNum instanceof Long || secondNum instanceof Long) {
                System.out.println(Long.valueOf(firstNum.longValue()+ secondNum.longValue()));
            } else {
                System.out.println(Integer.valueOf(firstNum.intValue()+secondNum.intValue()));

            }
    }
    public static <T extends Number> void multiply( T firstNum, T secondNum) throws RuntimeException{
        if (firstNum instanceof Double || secondNum instanceof Double) {
            System.out.println(Double.valueOf(firstNum.doubleValue() * secondNum.doubleValue()));
        } else if (firstNum instanceof Float || secondNum instanceof Float) {
            System.out.println(Float.valueOf(firstNum.floatValue()* secondNum.floatValue()));
        } else
            if (firstNum instanceof Long || secondNum instanceof Long) {
            System.out.println(Long.valueOf(firstNum.longValue()*secondNum.longValue()));
        } else {
            System.out.println(Integer.valueOf(firstNum.intValue()*secondNum.intValue()));
        }
    }
    public static <T extends Number> void divide( T firstNum, T secondNum) throws RuntimeException, ArithmeticException{
        if (firstNum instanceof Double || secondNum instanceof Double) {
            System.out.println(Double.valueOf(firstNum.doubleValue() / secondNum.doubleValue()));
        } else if (firstNum instanceof Float || secondNum instanceof Float) {
            System.out.println(Float.valueOf(firstNum.floatValue()/secondNum.floatValue()));
        } else if (firstNum instanceof Long || secondNum instanceof Long) {
            if(Long.valueOf(firstNum.longValue()%secondNum.longValue())!=0)
                System.out.println(Double.valueOf(firstNum.doubleValue() / secondNum.doubleValue()));
            else System.out.println(Long.valueOf(firstNum.longValue()/secondNum.longValue()));
        } else {
            if(Integer.valueOf(firstNum.intValue()%secondNum.intValue())!=0)
                System.out.println(Double.valueOf(firstNum.doubleValue() / secondNum.doubleValue()));
            else System.out.println(Integer.valueOf(firstNum.intValue()/secondNum.intValue()));
        }
    }
    public static <T extends Number> void subtract( T firstNum, T secondNum) throws RuntimeException{
        if (firstNum instanceof Double || secondNum instanceof Double) {
            System.out.println(Double.valueOf(firstNum.doubleValue() - secondNum.doubleValue()));
        } else if (firstNum instanceof Float || secondNum instanceof Float) {
            System.out.println(Float.valueOf(firstNum.floatValue()-secondNum.floatValue()));
        } else if (firstNum instanceof Long || secondNum instanceof Long) {
            System.out.println(Long.valueOf(firstNum.longValue()-secondNum.longValue()));
        } else {
            System.out.println(Integer.valueOf(firstNum.intValue()-secondNum.intValue()));
        }
    }

}
