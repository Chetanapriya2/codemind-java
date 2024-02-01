import java.util.*;
public class Monopoly{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++)
        {
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            int r3 = sc.nextInt();
            if(r1 > (r2 + r3))
        {
            System.out.println("YES");
        }
        else if(r2 >(r1+r3))
        {
            System.out.println("YES");
        }
        else if(r3 > (r1+r2))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        }
        
    }
}