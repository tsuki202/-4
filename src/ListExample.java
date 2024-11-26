import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Додавання елементів
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Отримання елемента за індексом
        System.out.println("Елемент на індексі 1: " + list.get(1));

        // Редагування елемента
        list.set(1, "Blueberry");

        // Видалення елемента
        list.remove(2);

        // Виведення всіх елементів
        System.out.println("Оновлений список: " + list);
    }
}
