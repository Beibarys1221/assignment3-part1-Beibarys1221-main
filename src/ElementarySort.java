import java.util.Comparator;

public class ElementarySort {

    // bubble sort variant
    public static <E extends Comparable<E>> void sort(E[] list){
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {

                if (list[j].compareTo(list[j + 1]) > 0) {

                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static <E> void sort(E[] list, Comparator<? super E> comparator) {

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {

                if (comparator.compare(list[j], list[j + 1]) > 0) {

                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    // Example for Comparable usage
    public static <E extends Comparable<E>> E findMin(E[] list){
        int minIndex = 0;
        for (int i = 1; i < list.length; i++) {
            if  (list[i].compareTo(list[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return list[minIndex];
    }

    // Example for Comparator usage
    public static <E> E findMin(E[] list, Comparator<? super E> comparator) {
        int minIndex = 0;
        for (int i = 1; i < list.length; i++) {
            if  (comparator.compare(list[i],list[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return list[minIndex];
    }

    static void main() {
        String [] names = {"Bob", "John", "Alice"};

        //Comparable used
        System.out.println(findMin(names));

        // Comparator used
        System.out.println(findMin(names, new StringComparator()));
    }
}