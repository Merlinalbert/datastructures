package DAY1;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        
        int a = sc.nextInt();
             int b = sc.nextInt();
        
        System.out.println("Min: " + Math.min(a, b));
        System.out.println("Max: " + Math.max(a, b));
        
        sc.close();
    }
}

