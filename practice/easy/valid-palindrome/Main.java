import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        String s = sc.nextLine();
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}