
interface Sum {
    void sum();
}

interface Add {
    void add();
}

abstract class Vehicle {
    abstract void engine();
}

class Car extends Vehicle {
    void engine() {
        System.out.println("Car has good engine");
    }

    public void drive() {
        System.out.println("Driving....");
    }
}

class Truck extends Vehicle {
    void engine() {
        System.out.println("Truck has bad engine");
    }
}

public class main {
    public static void main(String[] args) {
        // Exercise 1: Control statement
        int x = 10;
        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }

        // Exercise 2: Function overloading
        int sum1 = add(5, 10);
        double sum2 = add(3.5, 2.5);
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);

        // Exercise 3: Classes and methods
        MyClass obj = new MyClass("Hello, Java!");
        obj.displayMessage();

        // Exercise 4: Array implementation
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Exercise 5: Multilevel inheritance
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.wagTail();

        // Exercise 6: Interface implementation
        Car car = new Car();
        car.drive();

        // Exercise 7: Exception handling
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Exercise 8: Class Student with data and method
        Student s1 = new Student("John", "New York", 20);
        Student s2 = new Student("Alice", "London", 22);
        s1.printData();
        s2.printData();

        // Exercise 9: Class Student2 with getData and printData methods
        Student2 s3 = new Student2();
        Student2 s4 = new Student2();
        s3.getData("John", "New York", 20);
        s4.getData("Alice", "London", 22);
        s3.printData();
        s4.printData();

        // Exercise 11: Class Bird with parameterized constructors
        Bird bird1 = new Bird();
        Bird bird2 = new Bird("Sparrow");
        System.out.println("Bird 1: " + bird1.name);
        System.out.println("Bird 2: " + bird2.name);

        // Task 12: Interfaces inheritance
        A1 objA1 = new A1();
        objA1.sum();
        objA1.add();

        // Task 13: Abstract class inheritance
        Car c = new Car();
        c.engine();
        Truck t = new Truck();
        t.engine();


    }

    // Function for Task 2
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // Class for Task 3
    static class MyClass {
        private String message;

        public MyClass(String message) {
            this.message = message;
        }

        public void displayMessage() {
            System.out.println(message);
        }
    }

    // Class for Task 5
    static class Animal {
        void eat() {
            System.out.println("Eating...");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Barking...");
        }
    }

    static class Puppy extends Dog {
        void wagTail() {
            System.out.println("Wagging tail...");
        }
    }

    // Class for Task 8
    static class Student {
        String name;
        String city;
        int age;

        public Student(String name, String city, int age) {
            this.name = name;
            this.city = city;
            this.age = age;
        }

        public void printData() {
            System.out.println("Name: " + name);
            System.out.println("City: " + city);
            System.out.println("Age: " + age);
        }
    }

    // Class for Task 9 and 10
    static class Student2 {
        String name;
        String city;
        int age;

        public void getData(String name, String city, int age) {
            this.name = name;
            this.city = city;
            this.age = age;
        }

        public void printData() {
            System.out.println("Name: " + name);
            System.out.println("City: " + city);
            System.out.println("Age: " + age);
        }
    }

    // Class for Task 11
    static class Bird {
        String name;

        public Bird() {
            this.name = "Unknown";
        }

        public Bird(String name) {
            this.name = name;
        }
    }

    // Class for Task 12
    static class A1 implements Sum, Add {
        public void sum() {
            System.out.println("Sum interface");
        }

        public void add() {
            System.out.println("Add interface");
        }
    }
}


