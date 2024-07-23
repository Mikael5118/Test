package inclass;

public class Person {
    int age;
    String name;
    double height;

    Person() {

    }

    Person(int age){
        this();
        this.age = age;
    }

    Person(int age, String name) {
        this(age);
        this.name = name;
    }

    Person(int age, String name, double height) {
        this(age, name);
        this.height = height;
    }


}
