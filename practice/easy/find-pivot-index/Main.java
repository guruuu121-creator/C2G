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
        int total = 0;
        int leftsum = 0;
        for(int num : nums){
            total += num;
        }
        for(int i=0;i<n;i++){
            int rightsum = total-leftsum-nums[i];
            if(leftsum==rightsum){
                System.out.println(i);
                return;
            }
            leftsum += nums[i];
        }
        System.out.println(-1);
    }
}