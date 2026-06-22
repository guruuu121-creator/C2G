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
         boolean found = false;
        for(int num : nums){
            if(set.contains(num)){
                 found = true;
            }
            set.add(num);
        }
        System.out.print(found);
    }
}