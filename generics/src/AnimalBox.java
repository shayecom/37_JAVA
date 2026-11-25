public class AnimalBox<T extends Animal> {

    private T animal;

    public AnimalBox(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void printAnimal() {
        System.out.println(animal.getName());
        animal.makeSound();
    }


}
