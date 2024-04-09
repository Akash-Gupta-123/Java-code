import java.util.Scanner;
class Fabonacci {
    public static void main(String[] args) {
        int x = 0 , y = 1 ,z = 0 , count , i ;
        System.out.println("Enter the count for FCS") ;
Scanner sc = new Scanner(System.in);
count = sc.nextInt();
for(i = 0;i< count;i++){
    System.out.println(z);
    x = y ;
    y = z ;
    z = x + y ;
}

    }
}