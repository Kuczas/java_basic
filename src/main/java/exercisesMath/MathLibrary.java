package exercisesMath;

public class MathLibrary {
    //1. Zaimplementuj metodę zwracającą średnią wartości
    //typu double podanych w argumencie metody jak tablica
    public static double avg(double [] args){
        double sum = 0;
        for (double a : args){
            sum += a; // sum = sum + a;
        }
        return sum/args.length;
    }

    //2.Zaimplementuj metodę potęgującą dwie liczby całkowite
    //Metoda zwraca wynik działania a przyjmuje jako argumenty kolejno
    //podstawę i wykładnik potęgi
    public static int power (int x, int y){
        int power = 1;
        for (int i = 0; i < y; i++){
            power *= x;
        }
        return power;
    }

    // 3. n!
    public static long factorial (int n) {
        long factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
    //4. n! - rekurencyjnie
    public static long favtorialR(int n){
        return (n > 1) ? n * favtorialR(n-1) : 1;
    }
    // 5. suma n-elementów ciągów fibonacciego
    //0  1 2 3 5 8 ...
    public static long fiboSum(int n){
        int [] fibo = new int [n];
        fibo[0] = 0;
        fibo[1] = 1;
        System.out.println(fibo[0] + " ");
        System.out.println(fibo[1] + " ");
        int fiboSum = 1;
        for (int i = 2; i< fibo.length; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
            System.out.print(fibo[i] + " ");
            fiboSum += fibo[i];

        }
        System.out.println();
        return fiboSum;
    }
}