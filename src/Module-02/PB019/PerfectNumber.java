import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int original = num;
        for(int i=1; i<num;i++){
            if(num%i == 0){
                sum = sum + i;
            }
        }
        if(original == sum){
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect number");
        }
        sc.close();
    }    
}
