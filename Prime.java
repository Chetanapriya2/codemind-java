import java.util.*;
public class Prime{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        if(n==1||n==0)
        {
            System.out.println( "Not Prime");
        }
        for(int i =2; i <=n/2;i++)
        {
            if(n%i==0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.print("Prime");
        }
        else
        {
            System.out.print("Not Prime");
        }
    }
}