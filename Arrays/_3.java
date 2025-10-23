package Arrays;

public class _3 {
    public static void main(String[] args) {
        int age[] = {21, 25, 30, 22, 28};
        int largest = age[0];
        for(int i=0; i<age.length; i++){
            if(age[i] > largest){
                largest = age[i];
            }
        }
        System.out.println("The largest age is: " + largest);
    }
}
