import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        int maxArea = 0;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            int w = right-left;
            int area = h * w;
             maxArea = Math.max(maxArea,area);
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
        }
        System.out.println(maxArea);
    }
}