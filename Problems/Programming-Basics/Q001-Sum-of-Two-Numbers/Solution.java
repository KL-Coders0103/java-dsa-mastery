import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer A");
        int A = sc.nextInt();
        System.out.println("Enter Integer B");
        int B = sc.nextInt();
        int sum = A + B;
        System.out.println("Sum of Two integers is: "+sum);
        sc.close();
    }
}