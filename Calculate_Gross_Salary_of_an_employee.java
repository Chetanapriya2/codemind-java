import java.util.*;
public class GrossSalary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float bs = sc.nextFloat();
        float HRA = sc.nextFloat();
        float DA = sc.nextFloat();
        double PF = bs*(0.12);
        double gs = bs+HRA+DA+PF;
        System.out.printf("%.2f
%.2f",PF,gs);
    }
}