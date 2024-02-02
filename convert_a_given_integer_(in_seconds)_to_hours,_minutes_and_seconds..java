import java.util.*;
public class Seconds{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int sec = s%60 ;
        int  x = (int)(s/60);
        int hr = (int)(x/60);
        int min = x%60;
        System.out.printf("H:M:S-%d:%d:%d",hr,min,sec);
        
    }
}