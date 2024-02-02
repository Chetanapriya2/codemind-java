import java.util.*;
public class Arithmetic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a+b;
        int d = a-b;
        int p = a*b;
        int q = a/b;
        int r = a%b;
        System.out.printf("Sum:%d
Difference:%d
Product:%d
Quotient:%d
Remainder:%d
",s,d,p,q,r);
    }
}