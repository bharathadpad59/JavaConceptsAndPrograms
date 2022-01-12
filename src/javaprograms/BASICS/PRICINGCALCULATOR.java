/**
 * PRICINGCALCULATOR
 */
import java.security.Key;
import java.util.Scanner;
public class PRICINGCALCULATOR {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the MBPO price");
        double price1=scn.nextDouble();
        double ninetysevenpercentageofmbpo=(97*price1)/100;
        double six=(6*price1)/100;
        double five=(5*price1)/100;
        double four=(4*price1)/100;
        double three=(3*price1)/100;
        double a=(ninetysevenpercentageofmbpo*5)/100;
        double b=(ninetysevenpercentageofmbpo*4)/100;


        System.out.println("97 % of MBPO="+ninetysevenpercentageofmbpo);
        System.out.println("6 % of MBPO="+six);
        System.out.println("5 % of MBPO="+five);
        System.out.println("4 % of MBPO="+four);
        System.out.println("3 % of MBPO="+three);
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        System.out.println("3rd iterastion value="+(five+price1));
        System.out.println("4th iterastion value="+(five+price1));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("5th iterastion value="+(a+ninetysevenpercentageofmbpo));
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("6th iterastion value="+(a+ninetysevenpercentageofmbpo));
        System.out.println("7th iterastion value="+(four+price1));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("8th iterastion value="+(b+ninetysevenpercentageofmbpo));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("9th iterastion value="+(four+price1));
        System.out.println("10th iterastion value="+(four+price1));
        System.out.println("11th iterastion value="+(four+price1));
        System.out.println("12th iterastion value="+(three+price1));
        System.out.println("13th iterastion value="+(three+price1));
        System.out.println("14th iterastion value="+(three+price1));

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("/n");
        if((a+ninetysevenpercentageofmbpo)<(five+price1) && (b+ninetysevenpercentageofmbpo)<(four+price1))
        {
            System.out.println("Result is SUCCESSFUL: 5 TH ITERATION PRICE < 4TH AND 8TH ITERATION PRICE < 7TH");
        }
      
        
       
       

    }

    
}