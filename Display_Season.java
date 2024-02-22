import java.util.*;
public class Season{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=3)
        {
            System.out.println("Spring");
        }
        else if(n>3 && n<=6)
        {
            System.out.println("Summer");
        }
        else if(n>6 && n<=10)
        {
            System.out.println("Rainy");
        }
        else if(n>10 && n<=12)
        {
            System.out.println("Winter");
        }
       else if(n==1)
        {
            System.out.println("Winter");
        }
        else{
            System.out.println(-1);
        }
    }
}