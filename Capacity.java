import java.util.*;
public class Capacity{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int S = sc.nextInt();
        int B = sc.nextInt();
        int c = 2*T*S*B*512;
        int C = c/1024;
        System.out.print(C+" "+"KB");
    }
}