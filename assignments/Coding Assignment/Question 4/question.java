import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int s = sc.nextInt();
        if(s<10){
            System.out.print("Slow");
        }else if(s<=50){
            System.out.print("Average");
        }else{
            System.outprint("Fast");
        }
    }
}