import java.util.*;
public class Loss{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a = sc.nextInt();
        float b= sc.nextInt();
        double l=(a-b)/a;
        System.out.printf("%.2f",l*100);
    }
}