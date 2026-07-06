import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        if ( num > 1) {
            for (int i = 2; i < num; i++ ) {
                if ( num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }


        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        
        }
        sc.close();
    }
}
