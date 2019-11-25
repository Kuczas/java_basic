package staticClass;

public class Main {
    public static void main(String[] args) {

        //Odwołanie do skłądowej statycznej
        //1.Nie wymaga utworzenia obiektu
        //2.Odwołujmey się poprzedzając składową nazwą klasy
        //3.Jest tylko 1 kopia skłdowej statycznej w ramach klasy

        User user1 = new User("x","x");
        System.out.println(user1.globalId);
        User user2 = new User("y","y");
        System.out.println();
    }
}
