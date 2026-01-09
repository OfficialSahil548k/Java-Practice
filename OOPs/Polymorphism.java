package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        // Claculator c1 = new Claculator();
        // System.out.println(c1.sum(10, 5));
        // System.out.println(c1.sum(11.4, 3.9, 18.3));

        Cat c = new Cat();
        c.eat();
    }
}

class Claculator {           // method overloading
    int sum(int a, int b) {
    return a+b;
}
    double sum(double a, double b, double c){
        return a+b+c;
    }
}

// method overriding
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("chewing...");
    }
}