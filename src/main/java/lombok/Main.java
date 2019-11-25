package main.java.lombok;

import javabeans.RGB;

public class Main {
    public static void main(String[] args) {
        AnnotationsLombok annotationsLombok = new AnnotationsLombok("michal","123","MK");
        //jest getter
        System.out.println(annotationsLombok.getLogin());
        //jest setter
        annotationsLombok.setLogin("XXX");
        //jest ToString()
        System.out.println(annotationsLombok);

        RGB rgb = new RGB(1,2,3);
        System.out.println(rgb);
    }
}
