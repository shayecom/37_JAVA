public class Main {

    public static void main(String[] args) {
        TextStorage textStorage = new TextStorage("Hello from text storage");
        NumberStorage numberStorage = new NumberStorage(100);
        textStorage.printDetails();
        numberStorage.printDetails();

        GenericStorage<String> genericStorage = new GenericStorage<>("Hello from generic storage");
        genericStorage.printDetails();
        GenericStorage<Integer> genericStorage2 = new GenericStorage<>(9999);
        genericStorage2.printDetails();
        GenericStorage<Boolean> genericStorage3 = new GenericStorage<>(true);
        genericStorage3.printDetails();
        Dog dog = new Dog("Rex");
        AnimalBox<Dog> dogBox = new AnimalBox<>(dog);

        Cat cat = new Cat("Bob");
        AnimalBox<Cat> catBox = new AnimalBox<>(cat);

        dogBox.printAnimal();
        catBox.printAnimal();


    }

}
