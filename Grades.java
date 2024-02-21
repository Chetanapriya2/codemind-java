import java.util.*;
public class Grades{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int cs = sc.nextInt();
        int sum = p+c+b+m+cs;
        double david=(sum*100);
        double john = david/500;
        if(john>=90){
            System.out.println("Grade A");
        }
        else if(john>=80){
            System.out.println("Grade B");
        }
        else if(john>=70){
            System.out.println("Grade C");
        }
        else if(john>=60){
            System.out.println("Grade D");
        }
        else if(john>=40){
            System.out.println("Grade E");
        }
        else if(john<40){
            System.out.println("Grade F");
        }
        
    }
}