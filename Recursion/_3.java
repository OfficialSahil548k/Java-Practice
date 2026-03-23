package Recursion;

public class _3 {

    public static int tilingProblem(int n){
        if(n ==0 || n==1){
            return 1;
        }
        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);
        int total_ways = fnm1 + fnm2;

        return total_ways;
    }
    public static void main(String[] args) {
        int ways_of_titling = tilingProblem(3);
        System.out.println(ways_of_titling);
    }
}
