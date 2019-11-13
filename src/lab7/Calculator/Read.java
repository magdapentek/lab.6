package lab7.Calculator;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.

public class Read {
    public int getInt() {
        int x = 0;

        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("enter a number: ");
                x = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return x;


    }

//    2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
//    care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)

    public float getY() {

        float y = 0;

        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("enter a number: ");
                y = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return y;
    }

    public double getDouble() {
        double x = 0;

        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("enter a number: ");
                x = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return x;


    }

    public long getLong() {
        long z = 0;

        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("enter a number: ");
                z = scan.nextLong();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return z;
}

    public byte getByte() {
        byte b = 0;

        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("enter a number: ");
                b = scan.nextByte();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return b;
    }

    public short getShort() {
        short s = 0;

        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("enter a number: ");
                s = scan.nextShort();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return s;
    }

//    3. In clasa Read, creati o metoda care sa returneze un array de numere populat
//    de la tastatura. Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public int getArray[]; {
//        int a = 6;

        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                int[] myArray = new int [6];
                System.out.print("enter six numbers: " );
                System.out.println(myArray);
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

    }


//4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
// Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
// (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)

    public void myListOfNumbers(){
        Scanner scan = new Scanner(System.in);
           try{ myListOfNumbers();
               int x = scan.nextInt();
               System.out.println("Write numbers: ");

}catch (StackOverflowError e){
               System.out.println("Write just numbers.");
           }
    }}



