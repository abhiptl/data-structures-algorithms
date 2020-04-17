package Basics.DataStructures;

import java.lang.reflect.Method;

/**
 * https://www.hackerrank.com/challenges/java-generics/problem
 */
public class GenericsPrinting {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}

class Printer
{
    //Write your code here
    public <T> void printArray(T[] input) {
        for(T a : input) {
            System.out.println(a);
        }
    }

}