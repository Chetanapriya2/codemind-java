import java.util.*;
public class Height{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>y){
            System.out.print(x);
        }
        else if(x<y)
        {
            System.out.print(y);
        }
    }
}