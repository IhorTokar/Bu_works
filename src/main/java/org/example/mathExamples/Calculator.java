package org.example.mathExamples;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Calculator {
    private static final Scanner SCAN = new Scanner(System.in);

    public Calculator(){

    }

    public void resultend(){
        Object exaple = Solve(scan());
        System.out.println("Результат обчислень:" + exaple);
    }
    private static String scan(){
        System.out.println("Введіть ваш приклад: ");
        return SCAN.nextLine();
    }
    public Object Solve(String example){
        double result = 0;
        int counsym = 0;
        try {


            for (char sym : example.toCharArray()) {
                if (String.valueOf(sym).matches("[+\\-*/%]")) {
                    counsym++;
                }
            }
            if (counsym > 1) {
                throw new IllegalArgumentException("Приклад занадто складний");
            }
            String[] numbers = example.split("[+\\-*/%]");
            for (String num : numbers) {
                for (char cursym : num.toCharArray())
                    if (!Character.isDigit(cursym)) {
                        throw new IllegalArgumentException("Присутня буква або нечисловий символ в прикладі");
                    }
            }
            try {


                double num1 = Double.parseDouble(numbers[0]);
                double num2 = Double.parseDouble(numbers[1]);

                char operator = example.replaceAll("[^+\\-*/%]", "").charAt(0);
                switch (operator) {
                    case '%':
                        result = num1 % num2;
                        break;
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            throw new IllegalArgumentException("Помилка:Ділення на нуль");
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Невідома операція");
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Невірний формат чисел");
            }
        }catch (NullPointerException e){
            return 0;
        }
        return result;
    }
}
