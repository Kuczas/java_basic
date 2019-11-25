package java_introduction;

// CTRL + /             -> komentarz jednowierszowy
// CTRL + SHIFT + /     -> komentarz blokowy
// psvm                 -> public static void main(String[] args) {}
// sout                 -> System.out.println();
// CTRL + SHIFT + F10   -> Run program
// CTRL + D             -> Zduplikowanie lini
public class introduction {
    // metoda uruchomieniowa -> automatycznie wywoływana jako pierwsza w trakcie projektu
    public static void main(String[] args) {
        // Polecenie wypisujące wartości podane w argumencie na standardowym wyjściu
        System.out.println("Hello world!");
        // Pobranie numeru wersji JRE
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.version"));
        
        // typy danych
        // byte mySmallNumber = 55555555555;   -> błąd zbyt mała pracyzja typu byte
        int myFirstNumber = 500040;
        System.out.println("myFirstNumber = " + myFirstNumber);
        System.out.println("Dodawanie liczb: " + (100 + myFirstNumber));
        double salaryNet = 9150.99;
        int vatTax = 23;
        System.out.println("Kwota netto: " + salaryNet + "zł");
        System.out.println("Kwota brutto: " + (salaryNet * (1 + (vatTax /100.0))) );
        //formatowanie wyjścia
        System.out.printf("Kwota brutto: %.2f zł\n", (salaryNet * (1 + (vatTax /100.0))));
        System.out.printf("%.2f zł netto to %.2f zł brutto\n", salaryNet, (salaryNet * (1 + (vatTax /100.0))));
        System.out.printf("Liczba: %20.2f\n", salaryNet);

        char smallLetter = 'a';
        char bigLetter = 'A';
        char dotChar = '.';

        System.out.println(smallLetter);
        System.out.println((char) (bigLetter + 10));
        System.out.printf("Wypisz ten znak z formatowaniem: %c\n", dotChar);
        System.out.printf("Znak : %c ma %d numer ASCII\n", dotChar, (int)dotChar);

        boolean isActivated = true;
        System.out.println(isActivated);
        System.out.println(!isActivated);


    }
}