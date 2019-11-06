///*
package lab6.calculator;

import java.io.OutputStream;
import java.util.List;

public class LogicalOp {
    private List<Integer> numberlist;
    private int number;
    private int position;

    //    Scrieti o metoda Java, care sa primeasca doi parametrii:
//    un parametru sa fie o lista de numere, si celalalt un numar
//    (real sau intreg). Metoda sa adauge numarul primit ca si parametru
//    la final de lista.

    public void addToList(List<Integer> list, int number) {
        list.add(number);
    }

///Scrieti o metoda Java, care sa primeasca parametru o
// Lista, si sa afiseze, pe rand, toate valorile din
// lista, fiecare pe rand nou.

    public void printList(List<Integer> listName) {
        for (int i = 0; i < listName.size(); i++)
            System.out.println(listName.get(i));


        for (int i : listName) {
            System.out.println(i);
        }
    }

//Scrieti o metoda Java, care sa primeasca doi parametrii:
// un parametru de tip Lista, iar celalalt un numar intreg.
// Sa se parcurga lista si sa afiseze, pe rand, toate
// valorile din lista, fiecare pe rand nou, pornind de la
// numarul intreg primit ca si parametru.


    public void printFromPosition(List<Integer> myList, int position) {
        for (int i = position; i < myList.size() && i >= 0; i++) {
            System.out.println(myList.get(i));
        }
    }


//    1. Scrieti o metoda Java, care sa primeasca parametru o Lista,
//    si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.

    public void listNewLine(List<Integer>  myList ){
        myList.forEach(System.out::println);
    }

//    Scrieti o metoda Java, care sa primeasca doi parametrii:
//    un parametru de tip Lista, iar celalalt un numar intreg.
//    Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
//    fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void listAndNumber (List<Integer> numberlist, int number){


    }

//    Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze,
//    pe rand, toate valorile din lista, dar invers(de la capat la inceput).

    public void listFromBack(List<Integer> myList){


    }

//        5. Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
//        unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
//        iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void listOfThree(List<String> stringlist, int number, String name ){
        stringlist.add("Hello ");
        stringlist.add("Word ");
        stringlist.add("!!!");

    }



//        6. Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
//        iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void exSix (int number, List<Integer> lists){
        System.out.println();
    }







//        8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
    
    public void exeight (List<Integer> numberlist){

    }





    }









