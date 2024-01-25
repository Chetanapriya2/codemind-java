import java.util.*;
public class Hype{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        float z = (x*x)+(y*y);
        System.out.printf("%.2f",Math.sqrt(z));
    }
}