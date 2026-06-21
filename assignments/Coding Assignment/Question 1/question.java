import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int battery = sc.nextInt();
        if(battery<20){
            System.out.print("Charge Soon");
        }else{
            System.out.print("Battery OK");
        }
    }
}