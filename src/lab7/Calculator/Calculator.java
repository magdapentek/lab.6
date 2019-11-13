package lab7.Calculator;

import java.util.List;

public class Calculator {
    public int sum(int f, int s){
        return f + s;
    }

    public int substract(int f, int s){
        return f - s;
    }

    public float multiply(int f, float s) {
        return f * s;
    }

    public float division(int f, int s){
        return f/s;
    }

    public double remainder(int f, int s) {
        return f%s;
    }


    public void printCountBackwards(int x, int y) {
        for (int i = x; i >= y; i--) {
            System.out.println(i);
        }
    }

    public int [] getArrayHundred() {
        int[] myArray = new int[100];
        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
        return myArray;
    }

    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public int verifyGreaterNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public float getAverageFromNumber(int x, int y) {
        float sum = 0;
        int count = 0;
        while (x <= y) {
            if (x % 7 == 0) {
                sum += x;
                count++;
            }
            x++;
        }

        return sum / count;
}
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.println("Pe pozitia " +
                    (i ) + " avem valoarea " +
                    array[i]);
    }

    //Write a Java program to calculate the
// average value of array elements.
    public float averageArray(int[] anArray){
        float sum = 0;
        for (int i = 0; i < anArray.length; i++){
            sum = sum + anArray[i];

        }
        return sum/anArray.length;
    }

    public void printListValuesReversed(List<Integer> myList){
        for (int i = myList.size()-1; i >= 0; i--){
            System.out.println((myList.get(i)));
        }

    }
}





