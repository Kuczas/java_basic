package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //znajdujemy się w pętli nieskończonej dopóki nie zostanie przerwana
        boolean isFinished = false;
        while (isFinished != true){

        // CLI -> Command Line Interface
        System.out.println("Witaj w naszej aplikacji");
        System.out.println("(L) - logowanie");
        System.out.println("(R) - rejestracja");
        System.out.println("(Q) - wyjście");
        // pobieramy tylko jeden znak
        char decision = scanner.nextLine().toUpperCase().charAt(0);
        switch (decision) {
            case 'L':
                System.out.println("logowanie");
                break;
            case 'R':
                System.out.println("rejestracja");
                break;
            case 'Q':
                System.out.println("wyjście");
                //przerwanie pętli
                isFinished = true;
                break;
            default:
                System.out.println("zły wybór");
                break;
        }
        }
    }
}