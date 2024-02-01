import java.util.*;
public class Factor{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       while(T-->0)
       {
           int a =sc.nextInt();
           int b =sc.nextInt();
           int z = Math.abs(a-b);
           if(z>=a || a==b)
           {
               System.out.printf("YES
");
           }
           else
           {
               System.out.printf("NO
");
           }
       }
    }
}