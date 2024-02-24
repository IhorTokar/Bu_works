package org.example.mathExamples;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
           /* String name = scan("Youre name");
            System.out.printf("Hello world from %s", name);*/
        Calculator solve = new Calculator();
        solve.resultend();
        Massive remover = new Massive();
        Object[] array = {"a", "a", "b", "c", "c", "3", "3", "q", "q"};
        Object[] unique = remover.removeDuplicates(array);
        System.out.println(Arrays.toString(unique));
    }

    public static String scan(String varname){
        System.out.printf("Please enter youre name %s/n", varname);
        return SCANNER.nextLine();
    }
}