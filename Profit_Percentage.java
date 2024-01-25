import java.util.*;
public class Profit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        double p = (b-a)/a;
        System.out.printf("%.2f",p*100);
        
    }
}