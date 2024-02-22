import java.util.*;
public class ElectricityBill 
{ 
        public static void main(String args[]) 
        {   
	   Scanner sc=new Scanner(System.in);
	   String custID = sc.nextLine();
	   String name = sc.nextLine();
       int units=sc.nextInt();
       double billpay=0;
           if(units<199)
           {
		      billpay=units*1.20;
           }
           else if(units>=200 && units<400)
           {
               billpay=units*1.50;
           }
           else if(units>=400 && units<600)
           {
               billpay=units*1.80;
           }
           else if(units>=600)
           {
               billpay=units*2.00;
           }
           double surcharge=0;
           if(units>400)
           {
               surcharge=billpay*0.15;
           }
           else
           {
               surcharge=100;
           }
           double amount = surcharge+billpay;
           System.out.printf("%.2f",amount);
   } 
}