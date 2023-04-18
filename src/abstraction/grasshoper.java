package abstraction;

public class grasshoper extends insect {
    public grasshoper(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The grasshoper makes a grasshoper sound");
    }
}

