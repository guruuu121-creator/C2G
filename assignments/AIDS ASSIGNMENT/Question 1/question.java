import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
       int n = sc.nextInt();
       int[] weights = new int[n];
       int l = 0;
       int h = 0;
       for(int i=0;i<n;i++){
        weights[i] = sc.nextInt();
        l = Math.max(l,weights[i]);
        h += weights[i];
       }
       int days = sc.nextInt();
       for(int capacity = l;capacity<=h;capacity++){
        int requiredDays = 1;
        int current =0;
        for(int w:weights){
            if(current + w>capacity){
                requiredDays++;
                current = w;
            }else{
                current += w;
            }
        }
        if(requiredDays<=days){
            System.out.println(capacity);
            break;
        }
       }
    }
}