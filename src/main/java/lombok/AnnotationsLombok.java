package main.java.lombok;

//model java beans

import lombok.*;

//@ToString // dodaje metodę ToString()
//@Setter // dodaje settery do wsytkich pól
//@Getter // dodaje gettery dla wszystkich pól
//@NoArgsConstructor //dodaje konstruktor domyślny - bez argumentów
@AllArgsConstructor //dodaje konstruktor z wszystkimi polami klasowymi w argumencie
@Data //dodaje gettery, settery i toString() do wszystkich pól klasowych

public class AnnotationsLombok {
    private String login;
    private String password;
    private String acronim;


}
