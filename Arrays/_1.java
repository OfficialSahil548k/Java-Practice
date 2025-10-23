package Arrays;

public class _1 {
    static int updateMarks(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 5;
        }
        return 0;
    }    
    public static void main(String[] args) {
        int marks[] = {85, 90, 78, 92, 88};
        updateMarks(marks);
        for(int i=0; i<marks.length; i++){
            System.out.println("Marks of student " + (i+1) + ": " + marks[i]);
        }
    }
}
