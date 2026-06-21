import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int currentData = sc.nextInt();
        int newPackData = sc.nextInt();
        int carriedForward;
        if(currentData<=2){
            carriedForward = currentData;
        }else{
            carriedForward = 2;
        }
        int FinalData = carriedForward + newPackData;
        System.out.print(FinalData);
    }
}