import Generics.genericClass;
import carParts.Wheels;
import carParts.engine;
import carParts.carBody;
import Graphs.graph;

import mypackage.Human;
import mypackage.Pig;
import mypackage.dog;

import java.io.File;
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Character;
import java.lang.String;
import java.lang.System;
import java.util.function.Consumer;


public class Main {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    //create an anonymous class
    public class AnonymousClass {
        public void myMethod() {
            System.out.println("This is an example of an anonymous class");
        }
    }

    private String name;
    private int age;
    //Q:whats the difference between private and protected?
    //A: private means that the variable can only be accessed by the class that it is in
    // and protected means that the variable can be accessed by the class that it is in and any child classes

    //Q: what does @Override do?
    //A: @Override is an annotation that tells the compiler that the method is overriding a method in the parent class
    //Q: is @override necessary here?
    //A: no, it is not necessary, but it is good practice to use it


    public static void main(String[] args) throws IOException {
        //testing the Human class
        Human human1 = new Human("Bob", 44);
        Human human2 = new Human("Sue", 25);
        human1.speak();
        human2.speak();
        //string methods
        String str = "Hello World";

        //convert char to string using toString()
        System.out.println(Character.toString('a'));
        //convert string to char using valueOf()
        System.out.println(String.valueOf("a"));

        //Interface implementation
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();


        //Q: what is type casting?
        //A: type casting is when you convert a variable from one type to another
        //widening casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        //narrowing casting
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        //order of datatype sizes
        //byte < short < int < long < float < double


        //upcast dog to human
        Human dog1 = new dog("dog", 5);
        Human human3 = new dog("human", 5);
        //downcast human to dog
        if (dog1 instanceof dog) {
            dog dog2 = (dog) human3;
        }
        //explain the code above
        //example of upcasting
        Human dog2 = new dog("dog", 5);
        //downcasting
        dog dog3 = (dog) dog2;

        //Generic class example
        genericClass<Integer> intObject = new genericClass<Integer>(15);
        System.out.println(intObject.get());
        //car example with composition and inheritance


        car car1 = new car("car1", new engine(52147, "V8", 4), new carBody("Sedan", "red", 5), new Wheels("Continental", 4, true), 0);

        carOwner carOwner1 = new carOwner("Peter Parker", 25, car1);

        carOwner.drive(car1);

        //exception handling
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
        //multiple exceptions

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[1]);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e.getMessage());
            //Q:what's null pointer exception?
            //A: null pointer exception is when you try to access a variable that is null
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        //reading from a file using a file reader
        try {
            FileReader file = new FileReader("C:\\Users\\lesegomat\\IdeaProjects\\Java_tutorial\\src\\dancingQueen.txt");
            //print the file
            int i;
            while ((i = file.read()) != -1)
                System.out.print((char) i);
            //close the file
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //try with resources
        try (FileReader file = new FileReader("C:\\Users\\lesegomat\\IdeaProjects\\Java_tutorial\\src\\neverGonna.txt")) {
            //print the file
            int i;
            while ((i = file.read()) != -1)
                System.out.print((char) i);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File myObj = new File("newfile.txt");
        if (myObj.createNewFile()) {
            //what does createNewFile() do?
            //it creates a new file
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }

        //write to the file with FileWriter

        try(FileWriter myWriter = new FileWriter("newfile.txt")){
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        //read from the file with FileReader
        try
        {
            FileReader myReader = new FileReader("newfile.txt");
            int i;
            while((i = myReader.read()) != -1)
                System.out.print((char)i);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //equals method
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));

        //inner class
        class outerClass{
            int x = 10;
            class InnerClass{
                int y = 5;
            }
        }
        outerClass myOuter = new outerClass();
        outerClass.InnerClass myinnerClass = myOuter.new InnerClass();
        System.out.println("inner class variable " + myinnerClass.y);


        //hashmaps are like dictionaries in python
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //add items to the hashmap
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        //get the value of a key
        System.out.println(map);

        //graphs using hash maps
        graph g = new graph();

        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);

        g.addEdge(1,2);
        g.addEdge(2,3);
//git commit -amend -no-edit


        g.printGraph();

        SortedMap<String,Integer> sortedmap = new TreeMap<>();
        sortedmap.put("b",3);
        sortedmap.put("c", 89);
        sortedmap.put("d",2);
        sortedmap.put("a",3);
         //print the sorted map
        System.out.println(sortedmap);
        //declare a collection
        Collection<Integer> values = new ArrayList<>();
        //add items to the collection
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        //print collection
        for(int i: values){
            System.out.println(i);
        }

        //sets
        Set<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        //print set
        for(int i: set){
            System.out.println(i);
        }

        //lambda expressions
        int num = 10;
        String name = "Hello";
        Consumer<String> myNameIsJeff = ("Jeff") -> { System.out.println("Hello World my name is "+ name);};



    }
}
