package com.plurasight;
import java.util.Locale;
import java.util.Scanner;

public class sandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("### Welcome to Sandwich Shop ###\n");
        String sandwichSize = """
                Please 1 or 2 as an integer to choose one of the Sandwich.
                1-Regular: base price $5.45
                2-Large: base price $8.95
                """;

        double sandwichPrice1 = 5.45;
        double sandwichPrice2 = 8.95;
        System.out.println(sandwichSize);
        int sandwichNumber = myScanner.nextInt();

        System.out.print("Would you like your sandwich loaded for an additional cost? (yes/no): ");
        String loadedDecision = myScanner.next();
        loadedDecision = loadedDecision.toLowerCase();
        if(loadedDecision.equals("yes")){
            if(sandwichNumber == 1){
                sandwichPrice1 += 1.00;
            } else if (sandwichNumber == 2) {
                sandwichPrice2 += 1.75;
            }
        }

        System.out.println("If you are Student OR 65 years old or older please enter your age if not enter 0 \n");
        int CustomerAge = myScanner.nextInt();

        if(CustomerAge <= 17){
            if(sandwichNumber == 1 ){
                System.out.println("The orignal price is: $"+sandwichPrice1+"\nDiscount is: $%.2f"+(sandwichPrice1-(sandwichPrice1-(sandwichPrice1*.10))));
                System.out.println("The price for the Regular Sandwich is: $"+(sandwichPrice1-(sandwichPrice1*.10)));
            } else if (sandwichNumber == 2) {
                System.out.println("The orignal price is: $"+sandwichPrice2+"\nDiscount is: $%.2f"+(sandwichPrice2-(sandwichPrice2-(sandwichPrice2*.10))));
                System.out.println("The price for the Large Sandwich is: $"+(sandwichPrice2-(sandwichPrice2*.10)));
            };
        } else if (CustomerAge >= 65) {
            if(sandwichNumber == 1 ){
                System.out.println("The orignal price is: $"+sandwichPrice1+"\nDiscount is: $%.2f"+(sandwichPrice1-(sandwichPrice1-(sandwichPrice1*.20))));
                System.out.println("The price for the Regular Sandwich is: $"+(sandwichPrice1-(sandwichPrice1*.20)));
            } else if (sandwichNumber == 2) {
                System.out.println("The orignal price is: $"+sandwichPrice2+"\nDiscount is: $%.2f"+(sandwichPrice2-(sandwichPrice2-(sandwichPrice2*.20))));
                System.out.println("The price for the Large Sandwich is: $"+(sandwichPrice2-(sandwichPrice2*.20)));
            };
            
        }else {
            //This the orginal price without any discount
            if(sandwichNumber == 1 ){
                System.out.println("The price for the Regular Sandwich is: $"+sandwichPrice1);
            } else if (sandwichNumber == 2) {
                System.out.println("The price for the Large Sandwich is: $"+sandwichPrice2);
            };
        }


    }
}
