import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int gcd = 1;
        int lcm = 1;
        int min = Math.min(numA, numB);
        for(int i=1; i<=min; i++){
            if(numA%i == 0 && numB%i == 0){
                gcd = i;
            }
        }
        lcm = ( numA * numB ) / gcd;
        System.out.println(lcm);
        sc.close();
    }   
}
