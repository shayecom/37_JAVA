import java.util.ArrayList;

public class Main {

    public static <T> ArrayList<Boolean> compareLists(ArrayList<T> first, ArrayList<T> second) {
        ArrayList<Boolean> result = new ArrayList<>();

        for (T item : first) {
            if (second.contains(item)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static ArrayList<Boolean> compareList(ArrayList<String> first, ArrayList<String> second) {

        ArrayList<Boolean> result = new ArrayList<>();

        for (String item : first) {
            if (second.contains(item)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Student> first = new ArrayList<>();
//        first.add("Red");
//        first.add("Green");
//        first.add("Black");
//        first.add("White");
//        first.add("Pink");

        ArrayList<Student> second = new ArrayList<>();
//        second.add("Red");
//        second.add("Green");
//        second.add("Black");
//        second.add("Pink");

        Student student1 = new Student("David");
        Student student2 = new Student("Jane");
        first.add(student1);
        second.add(student2);
//        System.out.println(compareList(first, second));
        System.out.println(compareLists(first, second));
    }

}
