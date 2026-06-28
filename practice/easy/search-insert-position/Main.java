import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(nums[i]>=target){
                System.out.println(i+ " "); 
                return;
            }
        }
        System.out.println(n+ " ");
    }
}