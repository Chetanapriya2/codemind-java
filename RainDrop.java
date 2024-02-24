import java.util.*;
public class RainDrop
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int david = sc.nextInt();
         if(david%3==0 && david%5==0)
        {
            System.out.print("PlingPlang");
        }
        else if(david%3==0 && david%7==0)
        {
            System.out.print("PlingPlong");
        }
        else if(david%5==0 && david%7==0)
        {
            System.out.print("PlangPlong");
        }
        else if(david%3==0)
        {
            System.out.print("Pling");
        }
        else if(david%5==0)
        {
            System.out.print("Plang");
        }
        else if(david%7==0)
        {
            System.out.print("Plong");
        }
        
        else if(david%3==0 && david%5==0 && david%7==0)
        {
            System.out.print("PlingPlangPlong");
        }
        else{
            System.out.print(david);
        }
    }
}