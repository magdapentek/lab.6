package lab6.calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(5);

        System.out.println(myList);


//       apelarea exercițiului 3.
        LogicalOp op = new LogicalOp();
        op.listAndNumber(myList, 9);
//        System.out.println(9);
        myList.forEach(System.out::println);

//        LogicalOp op = new LogicalOp();
//        op.addToList( myList, 4);
//        System.out.println(myList);

//        Apelarea exercitiului 6.
        LogicalOp six = new LogicalOp();
        six.exSix(88, myList);
        System.out.println(myList);


//        Apelarea exercitiului 1.
        LogicalOp up = new LogicalOp();
        myList.forEach(System.out::println);

        LogicalOp cup = new LogicalOp();
        cup.listFromBack(myList);

            }

//             7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
////        si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).




    public void displayNumbers(List<Integer> list,  int number){
        List<Integer> displayNumber = new ArrayList<>();
        displayNumber.add(1);
        displayNumber.add(3);
        displayNumber.add(2);
        displayNumber.add(5);

//        displayNumber.forEach(System.out::println);




            }









    }



