package geekbrains.lesson_6;

public class Main {

    public static void main(String[] args) {

        Animal[] zoo = {
                new Cat("Barsik"),
                new Cat("Murzik"),
                new Dog("Bobik"),
                new Dog("Barbos")};
        for (Animal animal : zoo) {
            animal.swim(10);
            animal.run(300);
        }
    }
}

