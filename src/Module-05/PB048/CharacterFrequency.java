import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String alreadyAppeared = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            if(alreadyAppeared.indexOf(ch) == -1){
                int count = 0;
                for(int j=0; j<str.length(); j++){
                    if(str.charAt(j) == ch){
                        count++;
                    }
                }
                System.out.println(ch+":"+count);
                alreadyAppeared = alreadyAppeared + ch;
            }
        }
        sc.close();
    }    
}
