package variables;
// ALT + ENTER
import static java.lang.Math.pow;

public class Methematics {
    public static void main(String[] args) {
        //stałe z klasy matematycznej
        final double PI = Math.PI;
        // x^y
        int x = 5;
        int y = 2;
        //pow(podstawa,wykładnik)
        //konwersja na typ (int)
        int result = (int)pow(x,y);
        //double result = pow(x,y);
        System.out.println(result);
        //pierwiastek 3 stopnia
        System.out.println(pow(8,(1.0/3)));

        int a = 5;
        int b = 8;

        //wynik działania jest typu składnika o najwyższej precyzji w działaniu
        System.out.println(a * b);
        //konwersja rozszerzająca -> konwersja do typu wyższej precyzji
        System.out.println(((double)a) / b);
        //konwersja zarężająca ->konwersja do typu niższej precyzji
        double measure = 1.443;
        System.out.println((int)measure);


    }
}
