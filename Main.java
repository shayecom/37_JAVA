public class Main {

    public static void main(String[] args) {
//        IntegerBox integerBox = new IntegerBox(10);
//        System.out.println(integerBox.getItem());
//        StringBox stringBox = new StringBox("Hello");
//        System.out.println(stringBox.getItem());
        /**
         * T = Type
         * E = Element
         * K = Key
         * V = Value
         * N = Number
         * R = Return type
         */
        Box<String, Integer> stringBox = new Box<>("Hello");
        Box<Integer, Integer[]> integerBox = new Box<>(10);
        Box<Double, Boolean> doubleBox = new Box<>(10.5);
        Box<Boolean, Box> booleanBox = new Box<>(true, Level.EASY);
//        stringBox.setItem(500); // Compilation error
        System.out.println(stringBox.getItem());


//        System.out.println();
    }
}
