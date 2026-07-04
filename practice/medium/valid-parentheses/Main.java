import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
      String s = sc.nextLine();
       while(s.contains("()")||s.contains("{}")||s.contains("[]")){
        s = s.replace("()", "");
        s = s.replace("{}", "");
       s =  s.replace("[]", "");
       }
       System.out.println(s.isEmpty());
    }
}