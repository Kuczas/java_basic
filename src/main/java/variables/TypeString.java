package variables;

public class TypeString {
    public static void main(String[] args) {
        String text = "Dowolny napis 1 1.234";
        System.out.println("text = " +text);
        System.out.println("Pierwszy znak napisu: " + text.charAt(0));
        System.out.println("Trzeci znak napisu: " + text.charAt(2));
        System.out.println("Ostatni znak napisu: " + text.charAt(text.length() -1));

        System.out.println("y znajduje się na indeksie: " + text.indexOf('y'));
        System.out.println("spacja znajduje się na indeksie: " + text.indexOf(' '));
        System.out.println("napis znajduje się na indeksie: " + text.indexOf("napis"));

        // Jak wydobyć i zapisać w nowej zmiennej słowo napis z zmienej text
        String napis = text.substring(8,13);
        System.out.println(napis);

        String cite = "Być albo nie być";
        String updatedCite = cite.replaceAll( "ć", "c");
        System.out.println(updatedCite);

        String name1 = "ALA";
        String name2 = "ala";
        System.out.println(name1.equals(name2));
        System.out.println(name1.length() > name2.length());

        //Sprawdzenie czy napis jest palindromem
        String txt = "KAJAK";
        //utworzyliśmy obiekt klasy StringBuffer -> edytowalny String
        System.out.println(txt);
        StringBuffer editabletxt = new StringBuffer(txt);
        //odwrócenie kolejności liter w napisie
        editabletxt.reverse();
        //przywrócenie odwróconego napisu do zmiennej String -> nieedytowalny
        String txtReversed = editabletxt.toString();
        System.out.println(editabletxt);

        System.out.println("Czy napis jest palindromem:" +txt.equals(txtReversed));

        //inny sposób
        for(int index = 0; index <= txt.length() -1; index=index + 1) {
            if(txt.charAt(index) == txt.charAt(txt.length() - 1 - index)) {
                System.out.println("Nie jest palindromem");
            }
            System.out.println("index: " +index + " jest równy: " + (txt.length() -1 -index));
        }

        String login = "Kuczas";
        System.out.println(login.equals("kuczas"));
        System.out.println(login.toUpperCase().equals("kuczas".toUpperCase()));

        String sentence = "Być albo nie być oto jest pytanie";
        //podzeilić zdanie na wyrazy
        //separator -> spacja
        String [] words = sentence.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);
        System.out.println(words[5]);
        System.out.println(words[6]);



            }
    }