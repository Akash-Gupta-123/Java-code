import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        boolean flag = false;
        
        for (int i = 2; i <= a/ 2; ++i) {
        // Condition for nonprime number
            if (a % i == 0) {
                flag = true;
                break;
            }
        }
        
        if (!flag)
            System.out.println(a + " is a prime number.");
        else
            System.out.println(a + " is not a prime number.");

        sc.close();
        }
       
    }
