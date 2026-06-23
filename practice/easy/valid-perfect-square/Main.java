import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
         long num = sc.nextLong();
         for(long i=1;i*i<=num;i++){
            if(i*i==num){
                System.out.println(true);
                return;
            }
         }
         System.out.println(false);
    }
}