package lab7.Calculator;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class LogicalOp {


//5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru,
// si un numar. Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia
// numarului primit, iar daca valoarea numarului este mai mare decat numarul de pozitii din array,
// afisati textul: "Inside catch, number too large".

    public void addToArray(Array numbers, int number) {

        try {
            Scanner scan = new Scanner(System.in);
            int[] myArray =  new int[6];
            System.out.println("Enter a position: ");
            System.out.println(myArray[scan.nextInt()]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Inside catch, number too large");
        }
    }
//
//6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic, dar sa primeasca
// un parametru de tip int. In interiorul ei, tratati metoda Thread.sleep(), astfel incat metoda noastra
// sa primeasca valoarea in secunde, cat sa astepte. Ex: wait(5) -> asteapta 5 secunde.


    public synchronized void wait(int number){
       try{ Thread.sleep(5000);

       }catch (InterruptedException e){
           System.out.println(" ");
       }
    }





     }





