package variables;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        //utworzenie obiektu Scanner
        Scanner scanner = new Scanner(System.in);

        //wprowadzam liczbę
        System.out.println("Wprowadź liczbę zmiennoprzecinkową: ");
        double number = scanner.nextDouble(); // ENTER -> \n
        //aby skonsumować ENTER wykonujemy motodę nextLine()
        scanner.nextLine();
        //Wprowadzam napis
        System.out.println("Wprowadź napis: ");
        String text = scanner.nextLine();
        System.out.printf("Wprowadziłeś: %f i %s",number,text);

        //zamknięcie połączenia
        scanner.close();

    }
}
