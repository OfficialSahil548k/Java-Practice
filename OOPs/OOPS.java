package OOPs;

public class OOPS{
    public static void main(String[] args) {
        // Pen Pen_1 = new Pen();
        // Pen_1.set_props("Blue", "50g", 50, "Trimax" );
        // System.out.println(Pen_1.toString());

        student s1 = new student("Sahil",20);
        System.out.print("the name of student is : "+ s1.name);
        }

}

class Pen{

    String color;
    String weight;
    float price;
    String Brand;

    void set_props(String colour, String w, float p, String B ){
        color = colour;
        weight = w;
        price = p;
        Brand = B;
    }

    public String toString(){
        return "Color: " + color + "\nWeight: " + weight + "\nPrice: " + price + "\nBrand: " + Brand;
    }
}

class student {
    String name;
    int age;

    student(String name, int age){      // constructor
        this.name = name;
        this.age = age;
    }
}

