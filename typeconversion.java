public class typeconversion{
    public static void main(String[] args) {
        float a = 12.78f;
        // int b = a;  this will show error 
        int c = (int)(a); // but this will not
        System.out.println(c);

        char ch = 'z';
        int num = ch; // ASCII value
        System.out.print(num);
    }
}