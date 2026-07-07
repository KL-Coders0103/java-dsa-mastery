import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int min = Math.min(numA, numB);
        int gcd = 1;
        for(int i=1; i<=min; i++){
            if(numA%i == 0 && numB%i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        sc.close();
    }    
}
