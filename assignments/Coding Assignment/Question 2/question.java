import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
        if(n==1){
            System.out.print("Discount available");
        }else{
            System.out.print("no Discount");
        }
    }
}