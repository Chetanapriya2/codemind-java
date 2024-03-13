import java.util.*;
public class PrimesInRange{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int c=0;
    for(int i=n;i<=m;i++)
    {
       if(prime(i)==true)
       {
           c+=1;
       }
    }
    System.out.print(c);
}
 
 public static boolean prime(int a)
 {
     if(a<=1)
     {
         return false;
     }
     for(int i=2;i<=(Math.sqrt(a));i++)
     {
         if((a%i)==0)
         {
             return false;
         }
     }
     return true;
 }
}