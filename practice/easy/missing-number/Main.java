import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int sum =0;
        int max = n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        System.out.println(max-sum);
    }
}