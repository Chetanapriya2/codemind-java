import java.util.*;
public class Fahrenheit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double a = (9*c)+160;
        double f = a/5;
        System.out.printf("%.2f",f);
    }
}