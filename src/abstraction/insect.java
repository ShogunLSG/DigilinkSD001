package abstraction;

public abstract class insect {
    protected String name;
    protected int age;

    public insect(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public abstract void makeSound();
}

