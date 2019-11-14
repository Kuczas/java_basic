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
    }
}