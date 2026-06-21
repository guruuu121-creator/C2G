import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        String color = sc.nextLine();
        if(color.equals("Red")){
            System.out.print("Stop");
        }else if(color.equals("Yellow")){
            System.out.print("Wait");
        }else{
            System.out.print("Go");
        }
    }
}