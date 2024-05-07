public class even_series {
    
    public static void main(String[] args) {
    
        int x, y;
        x = 1;

        while(x!=100){
            y=x%2;
            if(y==0){
                System.out.println(x);
            }
            x++;
        }
    }
    
}
