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
        Arrays.sort(nums);
       int a = 1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<a){
            continue;
        }else if(nums[i]==a){
            a++;
        }else if(nums[i]>a){
             System.out.println(a);
             return;
        }
       }
     System.out.println(a);
    }
}