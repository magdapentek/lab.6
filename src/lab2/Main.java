package lab2;

public class Main {

    public static void main(String[] args) {

        int x = 5;
        int y = 4;
        int result = sum(x, y);
        System.out.println(result);
        result = substract(x,y);
        System.out.println(result);
        result = division(x,y);
        System.out.println(result);
        result = multiplication(x,y);
        System.out.println(result);

    }

    public static int sum(int first, int second) {

        int rez = first + second;
        return rez;
    }

    public static int substract(int first, int second) {

        int rez = first - second;
        return rez;
    }

    public static int division(int first, int second) {

        int rez = first / second;
        return rez;
    }

    public static int multiplication (int first, int second) {

        int rez = first * second;
        return rez;
    }



}

