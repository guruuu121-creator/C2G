import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        String s = sc.nextLine();
        HashSet<Character> set  = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            int length = right-left+1;
            max = Math.max(max,length);
        } 
        System.out.println(max);
    }
}