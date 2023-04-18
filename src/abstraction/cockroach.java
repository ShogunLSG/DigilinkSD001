package abstraction;

public class cockroach extends insect {
    public cockroach(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The cockroach makes a cockroach sound");
    }
}
