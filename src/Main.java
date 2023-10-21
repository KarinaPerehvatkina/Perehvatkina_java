import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Выберите действие:");
            System.out.println("1. Проверить число на больше 7");
            System.out.println("2. Проверить имя на совпадение с Вячеслав");
            System.out.println("3. Вывести элементы массива, кратные 3");
            System.out.println("0. Выйти");
            System.out.print("Введите номер действия: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите число: ");
                    int number = scanner.nextInt();
                    if (number > 7) {
                        System.out.println("Привет");
                    }
                    break;

                case 2:
                    System.out.print("Введите имя: ");
                    String name = scanner.next();
                    if (name.equals("Вячеслав")) {
                        System.out.println("Привет, Вячеслав");
                    } else {
                        System.out.println("Нет такого имени");
                    }
                    break;

                case 3:
                    System.out.print("Введите размер массива: ");
                    int size = scanner.nextInt();
                    int[] array = new int[size];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        array[i] = scanner.nextInt();
                    }
                    System.out.println("Элементы массива, кратные 3:");
                    for (int num : array) {
                        if (num % 3 == 0) {
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Программа завершена.");
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 0);
    }
}