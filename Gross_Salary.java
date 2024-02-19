import java.util.*;
public class GrossSalary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bs = sc.nextInt();
        double DA=0;
        double HRA=0;
        if(bs<=10000)
        {
         DA=bs*0.8;
         HRA =bs*0.2;
        }
        else if(bs<=20000)
        {
            DA=bs*0.9;
            HRA=bs*0.25;
        }
        else if(bs>20000){
            DA =bs*0.95;
            HRA = bs*0.3;
        }
        double gs = bs+DA+HRA;
        System.out.printf("%.2f",gs);
    }
}