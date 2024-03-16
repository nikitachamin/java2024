import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> phoneBook = new HashMap<>();

        // Ввод данных с консоли
        System.out.println("Введите данные в формате \"Имя НомерТелефона\" (для завершения введите \"end\"):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Неверный формат ввода. Попробуйте еще раз.");
                continue;
            }
            String name = parts[0];
            String phoneNumber = parts[1];
            addContact(phoneBook, name, phoneNumber);
        }

        // Вывод телефонной книги
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size())); // Сортировка по убыванию числа телефонов

        System.out.println("Телефонная книга:");
        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Метод для добавления контакта в телефонную книгу
    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(name, numbers);
    }
}