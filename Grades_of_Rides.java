import java.util.*;
public class GradeRide{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int hurl = sc.nextInt();
        int spin = sc.nextInt();
        int speed = sc.nextInt();
        if(hurl>50 && spin>60 && speed>100)
        {
            System.out.print(10);
        }
        else if(hurl>50 && spin>60)
        {
            System.out.print(9);
        }
        else if( spin>60 && speed>100)
        {
            System.out.print(8);
        }
        else if(hurl>5 && speed>100)
        {
            System.out.print(7);
        }
        else if(hurl>50)
        {
            System.out.print(6);
        }
        else if( spin>60 )
        {
            System.out.print(6);
        }
        else if(speed>100)
        {
            System.out.print(6);
        }
        else
        {
            System.out.print(5);
        }
    }
}