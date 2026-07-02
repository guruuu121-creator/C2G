import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
             if(n<0){
                System.out.println(No);
                return;
             }
             String s = String.valueOf(n);
             String rev = new StringBuilder(s).reverse().toString();
             if(s.equals(rev)){
                System.out.println("YES");
             }else{
                System.out.println("NO");
             }
            }
        } 