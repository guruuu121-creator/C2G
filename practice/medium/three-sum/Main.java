import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> ans  = threeSum(nums);
        for(List<Integer> list : ans){
             for(int i=0;i<list.size();i++){
                if(i>0){
                    System.out.print(" ");
                }
                System.out.print(list.get(i));
             }
             System.out.println();
}
    }
public static List<List<Integer>>  threeSum(int[] nums){
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++){
        if(i>0 && nums[i] == nums[i-1]){
            continue;
        }
        int a = i+1;
        int b = nums.length-1;
        while(a<b){
            int sum = nums[i] + nums[a] + nums[b];
            if(sum==0){
                ans.add(Arrays.asList(nums[i],nums[a],nums[b]));
                a++;
                b--;
            while(a<b && nums[a]==nums[a-1]){
                a++;
            }
            while(a<b && nums[b]==nums[b+1]){
                b--;
            }
            }
            else if(sum<0){
                a++;
            }else{
                b--;
            }
        }

    }
    return ans;
}

}