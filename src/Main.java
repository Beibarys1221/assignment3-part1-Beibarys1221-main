import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАПУСК ТЕСТОВ ДЛЯ ЛАБОРАТОРНОЙ ===\n");

        // 1. Тест строк (Comparable)
        String[] names1 = {"Bob", "John", "Alice"};
        System.out.println("Минимальное имя (по алфавиту): " + ElementarySort.findMin(names1)); // Должно быть Alice

        // 2. Тест строк (Comparator по длине)
        String[] names2 = {"Bob", "John", "Alice"};
        System.out.println("Самое короткое имя: " + ElementarySort.findMin(names2, new StringComparator())); // Должно быть Bob

        System.out.println("\n-----------------------------------\n");

        // Данные для тестов Person
        Person p1 = new Person("Viktor", "Petrov", 77, 173);
        Person p2 = new Person("Mateusz", "Nowak", 69, 160); // Самый низкий, фамилия раньше всех по алфавиту
        Person p3 = new Person("Amina", "Rahman", 55, 167);
        Person[] persons = {p1, p2, p3};

        // 3. Тест Person (Natural order: по росту)
        System.out.println("Самый низкий (height): " + ElementarySort.findMin(persons)); // Должно быть (Mateusz,Nowak,69,160)

        // 4. Тест Person (Custom order: по фамилии)
        System.out.println("Первый по фамилии (lastname): " + ElementarySort.findMin(persons, new PersonComparator())); // Должно быть (Mateusz,Nowak,69,160)

        System.out.println("\n-----------------------------------\n");

        // 5. Тест самой сортировки пузырьком
        System.out.println("Массив до сортировки пузырьком:");
        System.out.println(Arrays.toString(persons));

        System.out.println("\nМассив после сортировки (по росту):");
        ElementarySort.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}