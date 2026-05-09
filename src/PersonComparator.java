import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        int last = o1.lastname.compareTo(o2.lastname);
        if (last != 0) {
            return last;
        }

        int first = o1.firstname.compareTo(o2.firstname);
        if (first != 0) {
            return first;
        }

        return o1.weight - o2.weight;
    }
}