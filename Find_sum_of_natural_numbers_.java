import java.util.*;
public class Sum{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            c+=i;
        }
        System.out.print(c);
    }
}