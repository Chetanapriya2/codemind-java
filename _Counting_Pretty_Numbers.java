import java.util.*;
public class PrettyNumber{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=1;i<=t;i++)
    {
        int L = sc.nextInt();
        int R = sc.nextInt();
        int c =0;
        for(int j=L;j<=R;j++)
        {
            if(j%10==2||j%10==3||j%10==9)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}
}