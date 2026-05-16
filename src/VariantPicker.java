import java.util.Random;

public class VariantPicker {
    static String[] sorts = {"bubble", "selection", "insertion"};
    static String [] natural = {
            "by (weight-ascending,firstname-alphabetical-ascending,lastname-alphabetical-ascending)",
            "by (height-ascending,firstname-alphabetical-ascending,lastname-alphabetical-ascending)"
    };
    static String [] custom = {
            "by (lastname-alphabetical-ascending, firstname-alphabetical-ascending, weight-ascending)",
            "by (lastname-alphabetical-ascending, firstname-alphabetical-ascending, height-ascending)"};

    static void printVariant(long seed){
        Random rand = new Random(seed);
        System.out.println("Your Variant");
        System.out.println();

        // Исправлено: убрали "- 1", чтобы метод корректно учитывал все элементы массива
        System.out.println(sorts[rand.nextInt(0, sorts.length)]); // Elementary sort
        System.out.println(natural[rand.nextInt(0, natural.length)]); // Natural order
        System.out.println(custom[rand.nextInt(0, custom.length)]); // Custom order
    }

    // Исправлено: добавлена правильная сигнатура public static void main(String[] args)
    public static void main(String[] args) {
        long id = 250000; // Сюда подставьте свой ID (например, номер студенческого)
        printVariant(id);
    }
}