import java.util.*;
public class Cars{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            double n =y1/(double)x1;
            double m =y2/(double)x2;
            if(m<n)
            {
                System.out.println(1);
            }
            else if(n<m)
            {
                System.out.println(-1);
            }
            else if(n==m)
            {
                System.out.println(0);
            }
            
        }
    }
}