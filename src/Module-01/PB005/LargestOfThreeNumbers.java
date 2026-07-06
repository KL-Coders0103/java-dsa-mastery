import java.util.Scanner;

public class LargestOfThreeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if( a == b && b == c){
            System.out.println("All numbers are equal");
        } else {
            if( a >= b && a >= c ) {
                System.out.println(a);
            } else if( a <= b && b >= c ) {
                System.out.println(b);
            } else if ( a <= c && b <= c ) {
                System.out.println(c);
            }
        }
        sc.close();
    }
}