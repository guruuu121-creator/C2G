import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        int[] arr = new int[m];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        HashSet<Integer> printed = new HashSet<>();
        for(int x : nums){
            if(set.contains(x) && !printed.contains(x)){
                System.out.print(x+ " ");
                printed.add(x);
            }
        }
    }
}