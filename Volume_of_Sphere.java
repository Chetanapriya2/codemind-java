import java.util.*;
public class Sphere{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double v = 4*3.14*r*r*r;
        System.out.printf("%.2f",v/3);
    }
}