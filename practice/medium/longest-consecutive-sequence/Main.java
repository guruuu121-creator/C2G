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
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int count = 1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        System.out.println(max);
    }
}