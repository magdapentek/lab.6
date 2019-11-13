package lab7.Calculator;

import java.util.List;

public class Program {

    public void printMenuItems() {
        System.out.println(
                "Hello !\n" +
                        "Choose an option from the menu: \n" +
                        "1. Sum\n" +
                        "2. Substract\n" +
                        "3. Multiplication\n" +
                        "4. Division\n" +
                        "5. Remaider\n" +
                        "6. Print Count Backwards\n" +
                        "7. Print numbers in ArrayHundred\n" +
                        "8. Print numbers up to hundred\n" +
                        "9. Verify greater number\n" +
                        "10. Get average from numbers\n" +
                        "11. Print an Array\n" +
                        "12. Calculate avarge of Array\n" +
                        "13. Print List Values Reversed\n" +
                        "0. Exit"
        );
    }

    Calculator calc = new Calculator();
    Read read = new Read();
    List<Integer> myList;


    public boolean runProgramOptions() {
        printMenuItems();

        int numberFromUser = read.getInt();

        switch (numberFromUser) {
            case 1:
                sum();
                return true;
            case 2:
                substract();
                return true;
            case 3:
                multipliply();
                return true;
            case 4:
                division();
                return true;
            case 5:
                remaider();
                return true;
            case 6:
                printCountBackwards();
                return true;
            case 7:
                getArrayHundred();
                return true;
            case 8:
                printToHundred(0);
                return true;
            case 9:
                verifyGreaterNumber();
                return true;
            case 10:
                getAverageFromNumber();
                return true;
            case 11:
                printArray();
                return true;
            case 12:
                averageArray();
                return true;
            case 13:
                printListValuesReversed();
                return true;

            case 0:
                System.out.println("Bye!");
                break;

            default:
                System.out.println("The option does not exist, try again!");
                return true;
        }

        return false;


    }
    public void runProgram() {
        boolean repeat;
        do {
            repeat = runProgramOptions();

        } while (repeat == true);
    }

    public void sum(){
        int result = calc.sum(read.getInt(), read.getInt());
        System.out.println("The sum is: " + result);
    }

    public void substract(){
        int result = calc.substract(read.getInt(), read.getInt());
        System.out.println("Substraction is: " + result);
    }
    public void multipliply(){
        float result = calc.multiply(read.getInt(), read.getInt());
        System.out.println(("Multiply is: " + result));
    }
    public void division(){
        float result = calc.division(read.getInt(), read.getInt());
        System.out.println(("Division is: " + result));
    }
    public void remaider(){
        double result = calc.remainder(read.getInt(), read.getInt());
        System.out.println("Remainder is: " + result);
    }

    public void printCountBackwards() {
        calc.printCountBackwards(read.getInt(), read.getInt());
    }

     public void getArrayHundred(){
    calc.getArrayHundred();
//            asta nu functioneaza, dar nu stiu de ce.
    }

    public void printToHundred(int number){
        calc.printToHundred(read.getInt());
    }

    public void verifyGreaterNumber(){
        calc.verifyGreaterNumber(read.getInt(), read.getInt());
//        nici asta nu fuctioneaza.
    }

    public void getAverageFromNumber(){
        calc.getAverageFromNumber(read.getInt(), read.getInt());
        System.out.println("Avarge is: ");

    }

    public  void printArray(){
        calc.printArray(read.getArray);
    }
    public void averageArray(){
        calc.averageArray(read.getArray);
        System.out.println("That's array avarge: ");

    }

    public void printListValuesReversed(){
        calc.printListValuesReversed(myList);
        System.out.println(myList);

    }

}

