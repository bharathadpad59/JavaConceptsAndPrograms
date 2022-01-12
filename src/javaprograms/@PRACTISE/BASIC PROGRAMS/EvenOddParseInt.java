import java.util.*;

public class EvenOddParseInt

{

     public static void main(String []args)

     {

        int num;

        System.out.println("Enter a number: ");

        num=Integer.parseInt(args[0]);

        if(num % 2 == 0)

            System.out.println(num+" is even!");

        else

            System.out.println(num+" is odd!");

    }
}