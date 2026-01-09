package OOPs;

public class inheritence {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.walk();
        d1.bark();
        Fish f1 = new Fish();
        f1.swim();
        f1.fin();
    }
}


class Animal {
    void eat() {
        System.out.println("eating...");
    }
    void sleep() {
        System.out.println("sleeping...");
    }
    void walk() {
        System.out.println("walking...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swimming...");
    }
    void fin() {
        System.out.println("fins...");
    }
}
