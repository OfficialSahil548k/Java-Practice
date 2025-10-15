package Basics;
public class conditional1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;
        if(a>b){
            if (a>c){
                System.out.println(a + " is the Largest");
            }
            else{
                System.out.println(c + " is the Largest");
            }
        }
        else{
            if(b>c){
                System.out.println(b+ " is the Largest");
            }
            else{
                System.out.println(c+ " is the Largest");
            }
        }
    }
}
