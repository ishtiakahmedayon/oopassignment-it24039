class Animal {
    protected String name;
    protected int age;
    
    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " says Woof!");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println(name + " says Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Wali";
        dog.age = 3;
        dog.eat();
        dog.bark();
        
        Cat cat = new Cat();
        cat.name = "Tommy";
        cat.age = 2;
        cat.eat();
        cat.meow();
    }
}
