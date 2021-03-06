package ua.alevel.homeWork2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        // Сообщаем четное ли число, которое ввел пользователь.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number.");

        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Your number is even!");
        } else {
            System.out.println("Your number is uneven!");
        }

        // Находим меньшее по модулю из чисел.
        int a = 120;
        int b = 3;
        int c = -5;

        int firstOperation = Math.abs(a) < Math.abs(b) ? Math.abs(a):Math.abs(b);
        int result = Math.abs(c) < Math.abs(firstOperation) ? Math.abs(c):firstOperation;
        System.out.println(result);

    }
}
