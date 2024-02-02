import java.util.*;
public class LastDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        String year = Integer.toString(y);
        
        System.out.print(year.substring(2));
        
    }
}