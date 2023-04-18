package mypackage;

public class dog extends Human {
    //call constructor with super
    public dog(String name, int age) {
        super(name, age);
    }
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}