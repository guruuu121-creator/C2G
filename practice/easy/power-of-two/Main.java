import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
        while(n%2==0){
            n /= 2;
        }
        System.out.println(n==1);
    }
}
