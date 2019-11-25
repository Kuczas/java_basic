package hw2.ex7_8;

import staticClass.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

// ALT + Enter -> auto sugestie
public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    // dodawanie pracownika do listy
    // walidacja nr PESEL
    // -> len = 11
    // -> unique
    public String addEmployee(String name, String lastname, String PESEL, LocalDate birthDate, double salaryNet){
        // sprawdzenie poprawności w długości numeru PESEL
        if(PESEL.length() == 11 && isPESELUnique(PESEL)) {
            Employee e = new Employee(
                    name, lastname, PESEL,
                    LocalDate.now(), birthDate, salaryNet
            );
            employees.add(e);
            return e.toString();
        } else if (!isPESELUnique(PESEL)) {
            return "Istnieje taki PESEL w liście pracowników";
        } else {
            return "BŁĘDNY PESEL";
        }
    }
    // metoda sprawdzająca czy PESEL podany w argumencie występuję w liście pracowników
    private boolean isPESELUnique(String PESEL){
        for (Employee e : employees) {
            // sprawdzenie występowanie peselu
            if(e.getPESEL().equals(PESEL)){
                return false;
            }
        }
        return true;
    }

}