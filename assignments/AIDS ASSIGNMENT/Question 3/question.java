import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
        int count=0;
         String s = String.valueOf(n);
         for(int i=0;i<s.length();i++){
            int digit = s.charAt(i)-'0';
            if(digit%2==0){
                count++;
            }
         }
         System.out.println(count);
    }
}