import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=n-i-1; k>=0 ; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
