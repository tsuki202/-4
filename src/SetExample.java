import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> studentNames = new HashSet<>(Arrays.asList("Анна", "Олексій", "Анна", "Іван", "Марія"));

        // Виведення кількості унікальних імен
        System.out.println("Унікальні імена: " + studentNames.size());

        // Виведення унікальних імен
        System.out.println("Унікальні імена: " + String.join(", ", studentNames));
    }
}
