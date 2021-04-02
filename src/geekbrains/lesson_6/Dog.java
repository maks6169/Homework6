package geekbrains.lesson_6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int runLength) {
        if (runLength <= 500) {
            super.run(runLength);
        } else {
            System.out.printf("Собака %s  не может больше бежать\n", name);
        }
    }

    @Override
    public void swim(int swimLength) {
        if (swimLength <= 10) {
            super.swim(swimLength);
        } else {
            System.out.printf("Собака %s больше не может плыть\n", name);
        }
    }
}

