import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if(flag){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        sc.close();
    }    
}
