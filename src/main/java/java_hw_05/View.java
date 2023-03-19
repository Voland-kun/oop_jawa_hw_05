package java_hw_05;

import java.util.Scanner;

public class View<T extends Numbers>{
    Scanner userInput = new Scanner(System.in);

    public int getValueInt(String title, int flag) {
        System.out.printf("%s", title);
        while (true) {
            try {
                int userNumb = Integer.parseInt(userInput.next());
                if (flag == 2) {
                    if (userNumb != 0) {
                        return userNumb;
                    } else {
                        System.out.println("Введите корректное значение.");
                    }
                } else {return userNumb;}
            }
            catch (NumberFormatException e) {
                System.out.println("Введите корректное значение.");
            }
        }
    }

    public Complex getValueComplex(String title) {
        System.out.printf("%s\n", title);
        return new Complex(getValueDouble("Введите вещественную часть: "),getValueDouble("Введите мнимую часть: "));
    }

    public Rational getValueRational(String title) {
        System.out.printf("%s\n", title);
        return new Rational(getValueInt("Введите числитель: ", 1),getValueInt("Введите знаменатель: ", 2));
    }

    public double getValueDouble(String title) {
        System.out.printf("%s", title);
        while (true) {
            try {
                double userNumb = Double.parseDouble(userInput.next());
                return userNumb;
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное значение.");
            }
        }
    }

    public void print(T data, String title) {
        System.out.printf("%s %s\n", title, data);
    }

    public int selectMode() {
        System.out.println("Выберите режим работы калькулятора:\n" +
               "Комплексные числа - 1\nРациональные числа - 2");
        while (true) {
            try {
                int userChoice = Integer.parseInt(userInput.next());
                switch (userChoice) {
                    case 1:
                        System.out.println("Выбран режим работы с комплексными числами");
                        return 1;
                    case 2:
                        System.out.println("Выбран режим работы с рациональными числами");
                        return 2;
                    default:
                        System.out.println("Введите корректный номер.");
                }
            }  catch (NumberFormatException e) {
                System.out.println("Введите корректный номер.");
            }
        }
    }

    public String selectAction() {
        while (true) {
            System.out.println("Введите действие (+,-,*,/):");
            String userChoice = userInput.next();
            switch (userChoice) {
                case "+", "/", "*", "-":
                    return userChoice;
                default:
                    System.out.println("Введите корректный знак");
            }
        }
    }
}
