import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        res[0] = 1;
        for(int i=1;i<n;i++){
            res[i] = res[i-1]*nums[i-1]; 
        }
        int a = 1;
        for(int i=n-1;i>=0;i--){
            res[i] = res[i] * a;
            a *= nums[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i] + " ");
        }

    }
}