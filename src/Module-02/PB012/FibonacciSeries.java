import java.util.Scanner;

public class FibonacciSeries {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fn = 0;
        int sn = 1;
        int next;

        if(n == 1) {
            System.out.println(fn);
        } else if (n == 2) {
            System.out.println(sn);
        } else {
            for (int i=3; i<=n; i++){
                next = fn + sn;
                System.out.println(next);
                fn = sn;
                sn = next;
            }
        }
        sc.close();
   } 
}
