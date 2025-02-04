import java.util.Scanner;

public class TaskOne {
    //Todo: Напишите программу, которая проверяет,
    // является ли введенное пользователем число четным или нечетным,
    // с помощью тернарного оператора.
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = cs.nextInt();

        String result = (number % 2 == 0) ? "четное" : "нечетное";

        System.out.println("Число " + number + " является " + result + ".");

        AutoCloseable scanner;

    }
}
