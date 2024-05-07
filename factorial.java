import java.util.*;

public class factorial  {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number:");
        int n = sc.nextInt();

        int fact = 1, a;
        a = n;

        while( a!=1 ){
            fact = fact * a;
            a--;
        }

        System.out.println("Factorial of "+n+" is "+fact);

        sc.close();

    }
    
}