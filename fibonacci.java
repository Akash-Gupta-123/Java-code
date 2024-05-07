public class fibonacci {
    public static void main(String[] args) {
        int x = 0, y = 1, c = 0;
        for(int i = 0; i<=10; i++){
            System.out.print(c+" ");
            x = y;
            y = c;
            c = x + y; 
        }
    }
    
}
