import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        int sum = 0;
        int original = num;

        while(temp > 0){
            temp = temp/10;
            count++;
        }

        temp = num;
        while(temp>0){
            int digit = temp % 10;
            int power = 1;

            for(int i=1; i<=count; i++){
                power = power * digit;
            }
            sum = sum + power; 
            temp = temp / 10; 
        }
        if(original == sum){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        sc.close();
    }    
}
