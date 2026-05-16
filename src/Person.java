import java.util.Arrays;

public class Person implements Comparable<Person> {

    String firstname;
    String lastname;
    int weight;
    int height;

    public Person(String firstname, String lastname, int weight, int height) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "(" + firstname + "," + lastname + "," + weight + "," + height + ")";
    }

    @Override
    public int compareTo(Person that) {
        // 1. Сначала сортируем по росту (height) — по возрастанию
        if (this.height != that.height) {
            return Integer.compare(this.height, that.height);
        }

        // 2. Если рост одинаковый, сортируем по имени (firstname) — по алфавиту
        int first = this.firstname.compareTo(that.firstname);
        if (first != 0) {
            return first;
        }

        // 3. Если и имена одинаковые, сортируем по фамилии (lastname) — по алфавиту
        return this.lastname.compareTo(that.lastname);
    }

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Viktor","Petrov", 77, 173),
                new Person("Amina", "Rahman", 55, 167),
                new Person("Sofia", "Markovic", 60, 166),
                new Person("Mateusz", "Nowak", 69, 160),
                new Person("Timur", "Bekzat", 70, 169),
                new Person("Noor", "Al-Hassan", 120, 200),
                new Person("Daniel", "Kovalenko", 101, 180),
                new Person("Elena", "Smirnova", 65, 175),
                new Person("Arman", "Sadykov", 105, 175),
                new Person("Lucas", "Ferreira", 93, 190)
        };

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(persons));

        System.out.println("\nСортировка по Natural order (height -> firstname -> lastname):");
        ElementarySort.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}