import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int t = sc.nextInt();
        if(t>=30){
            System.out.print("Fan ON");
        }else{
            System.out.print("Fan OFF");
        }
    }
}