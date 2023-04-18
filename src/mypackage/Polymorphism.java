package mypackage;

public class Polymorphism {
    public static void main(String[] args) {
        //Q: why do we use public static void main(String[] args) in this class?

        //polymorphism example
        Human human1 = new Human("Bob", 44);
        Human human2 = new Human("Sue", 25);
        Human student1 = new student("John", 18);
        Human student2 = new student("Jane", 19);
        human1.speak();
        human2.speak();
        student1.speak();
        student2.speak();
    }
}
