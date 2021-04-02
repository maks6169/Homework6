package geekbrains.lesson_6;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int runLength) {
        System.out.printf("Животное %s бежит %d метров\n", name, runLength);
    }

    public void swim(int swimLength) {
        System.out.printf("Животное %s плывёт %d метров\n", name, swimLength);
    }
}
