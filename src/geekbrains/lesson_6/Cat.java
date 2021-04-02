package geekbrains.lesson_6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int runLength) {
        if (runLength <= 200) {
            super.run(runLength);
        } else {
            System.out.printf("Кошка %s  не может больше бежать\n", name);
        }
    }

    @Override
    public void swim(int swimLength) {
        System.out.printf("Кошка %s не умеет плавать.\n", name);
    }
}

