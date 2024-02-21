import java.util.*;
public class Color{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c == 'V')
        {
            System.out.print("Violet");
        }
        else if(c=='I')
        {
            System.out.print("Indigo");
        }
        else if(c=='B')
        {
            System.out.print("Blue");
        }
        else if(c=='G')
        {
            System.out.print("Green");
        }
        else if(c=='Y')
        {
            System.out.print("Yellow");
        }
        else if(c=='O')
        {
            System.out.print("Orange");
        }
        else if(c=='R')
        {
            System.out.print("Red");
        }
        else{
            System.out.print(-1);
        }
    }
}