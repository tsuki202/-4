import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        // Створення телефонного довідника
        Map<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Додати запис");
            System.out.println("2. Знайти номер за ім'ям");
            System.out.println("3. Видалити запис");
            System.out.println("4. Показати всі записи");
            System.out.println("5. Вийти");
            System.out.print("Оберіть опцію: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищення буфера

            switch (choice) {
                case 1:
                    System.out.print("Введіть ім'я: ");
                    String name = scanner.nextLine();
                    System.out.print("Введіть номер телефону: ");
                    String number = scanner.nextLine();
                    phoneBook.put(name, number);
                    System.out.println("Запис додано успішно!");
                    break;

                case 2:
                    System.out.print("Введіть ім'я для пошуку: ");
                    String searchName = scanner.nextLine();
                    if (phoneBook.containsKey(searchName)) {
                        System.out.println("Номер телефону: " + phoneBook.get(searchName));
                    } else {
                        System.out.println("Ім'я не знайдено.");
                    }
                    break;

                case 3:
                    System.out.print("Введіть ім'я для видалення: ");
                    String deleteName = scanner.nextLine();
                    if (phoneBook.remove(deleteName) != null) {
                        System.out.println("Запис видалено успішно!");
                    } else {
                        System.out.println("Ім'я не знайдено.");
                    }
                    break;

                case 4:
                    System.out.println("Всі записи у телефонному довіднику:");
                    for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case 5:
                    System.out.println("Вихід з програми. До побачення!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Невірна опція. Спробуйте ще раз.");
                    break;
            }
        }
    }
}
