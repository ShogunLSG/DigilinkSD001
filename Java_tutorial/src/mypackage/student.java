package mypackage;

public class student extends Human{
    public student(String name, int age) {
        super(name, age);
    }
    @Override
    public void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

//Q: what is a marker annotation?
//A: a marker annotation is an annotation that does not have any parameters
//Q: what is a single value annotation?
//A: a single value annotation is an annotation that has one parameter
