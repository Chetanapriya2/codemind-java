import java.util.*;
public class Home{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(y<=(5*x))
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
        }
}