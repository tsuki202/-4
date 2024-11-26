import java.util.*;

public class ListSetExample {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>(Arrays.asList("Анна", "Олексій", "Анна", "Іван", "Марія"));

        // Виведення унікальних імен з використанням LinkedHashSet (збереження порядку)
        Set<String> uniqueNames = new LinkedHashSet<>(studentNames);
        System.out.println("Унікальні імена: " + uniqueNames.size());
        System.out.println("Унікальні імена: " + String.join(", ", uniqueNames));

        // Перевірка наявності вашого імені
        boolean isYourNamePresent = uniqueNames.contains("Марія"); // Замість "Марія" вставте своє ім'я
        System.out.println(isYourNamePresent);
    }
}
