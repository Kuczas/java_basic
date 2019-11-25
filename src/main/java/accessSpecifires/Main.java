package accessSpecifires;

import accessSpecifires.animal.Animal;
import accessSpecifires.animal.mamal.Mamal;
import accessSpecifires.animal.mamal.reptile.Reptile;

import javax.crypto.ExemptionMechanismException;

public class Main {
    public static void main(String[] args) {
        Mamal mammal = new Mamal();
        mammal.setAge(10);
        System.out.println(mammal);

        Reptile reptile = new Reptile();
     //   System.out.println(reptile.name);
     //   System.out.println(reptile.getName());

        Animal animal = new Animal();
     //   animal.speed; //private nie jest dostępny poza pakietem animal
     //   animal.getSpeed();

    }
}
