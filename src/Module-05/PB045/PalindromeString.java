import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0;
        int right = str.length()-1;
        boolean flag = true;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            } else {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }    
}
