import java.util.Scanner;

public class TaskThree {
    //Todo: Напишите программу, которая проверяет,
    // делится ли введенное пользователем число нацело на 2 и 5 или на 3 и 7.

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.println("Введите число");
        int number = cs.nextInt();

        String examination;
        examination = (number % 2 == 0 & number % 5 == 0 || number % 3 == 0 & number % 7 == 0)? "делится": "не делиться";

        System.out.println("Число - " + number + " " + examination);

        AutoCloseable scanner;

    }
}
