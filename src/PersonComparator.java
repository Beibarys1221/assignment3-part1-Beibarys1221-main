import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        // 1. Сначала сортируем по фамилии (lastname) — по алфавиту
        int last = o1.lastname.compareTo(o2.lastname);
        if (last != 0) {
            return last;
        }

        // 2. Если фамилии одинаковые, сортируем по имени (firstname) — по алфавиту
        int first = o1.firstname.compareTo(o2.firstname);
        if (first != 0) {
            return first;
        }

        // 3. Если и фамилии, и имена совпали, сортируем по росту (height) — по возрастанию
        return Integer.compare(o1.height, o2.height);
    }
}