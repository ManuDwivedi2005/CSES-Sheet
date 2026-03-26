package CSES.introductrory_problem;
import java.io.*;
public class Permutations {
    public static void main(String[] args) throws IOException{
        //Write a code for beautiful permutations i.e no adjacent elements whose difference is 1 return any one such permutation
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
            return;
        }

        StringBuilder sb = new StringBuilder();
        // Print all even numbers first
        for (int i = 2; i <= n; i += 2) {
            sb.append(i).append(" ");
        }
        // Print all odd numbers second
        for (int i = 1; i <= n; i += 2) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
