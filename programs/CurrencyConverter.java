package programs;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();  
        scan.close();

        NumberFormat num1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat num2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat num3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat num4 = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat num5 = NumberFormat.getCurrencyInstance(new Locale("en", "ke"));

        String us = num1.format(payment);
        String france = num2.format(payment);
        String china = num3.format(payment);
        String india = num4.format(payment); 
        String kenya = num5.format(payment);

        System.out.println("US: " + us);
        System.out.println("France: " + france);
        System.out.println("China: " + china);
        System.out.println("India: " + india);
        System.out.println("Kenya: " + kenya);
    }
    
}
