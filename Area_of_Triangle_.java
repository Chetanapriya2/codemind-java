import java.util.*;
public class Area{
    public static void main(String[] args)
    {
        Scanner john = new Scanner(System.in);
        int a = john.nextInt();
        int b = john.nextInt();
        int c = john.nextInt();
        double s = (a+b+c)/2.0;
        double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",A);
    }
}