import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            sc.close();
            return;
        }

        boolean flag = true;
        String alreadyAppeared = "";
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(alreadyAppeared.indexOf(ch) != -1){
                continue;
            }
            int count1= 0;
            int count2= 0;

            for(int j=0; j<str1.length(); j++){
                if(str1.charAt(j) == ch){
                    count1++;
                }
            }
            for(int j=0; j<str2.length(); j++){
                if(str2.charAt(j) == ch){
                    count2++;
                }
            }
            if(count1 != count2){
                flag = false;
                break;
            }
            alreadyAppeared += ch;
        }
        if(flag){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        sc.close();
    }    
}
