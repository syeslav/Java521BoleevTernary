import java.util.Scanner;

public class TaskTwo {
    //Todo: Напишите программу, которая сравнивает два введенных числа и
    // выводит наибольшее из них с использованием тернарного оператора.
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = cs.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = cs.nextInt();

        int result = (firstNumber > secondNumber) ? firstNumber : secondNumber;

        System.out.println("Число - " + result);

        AutoCloseable scanner;

    }
}
