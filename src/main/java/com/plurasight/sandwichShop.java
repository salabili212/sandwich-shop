package com.plurasight;
import java.util.Locale;
import java.util.Scanner;

public class sandwichShop {
    public static void main(String[] args) {
        //Declear two variables for the two Sandwichs.
        double sandwichPrice1 = 5.45, sandwichPrice2 = 8.95;


        //Declearing the variable for the scanner
        Scanner myScanner = new Scanner(System.in);


        System.out.println("### Welcome to Sandwich Shop ###\n");
        //A prompet tp show the Sandwich Manu
        String sandwichSize = """
                Please 1 or 2 as an integer to choose one of the Sandwich.
                1-Regular: base price $5.45
                2-Large: base price $8.95
                """;


        //Printing the sandwich shop prompt
        System.out.println(sandwichSize);
        int sandwichNumber = myScanner.nextInt();

        //Asking if want to load for more loading and that will cost money
        System.out.print("Would you like your sandwich loaded for an additional cost? (yes/no):\n");
        System.out.print("a. Regular: $1.00\nb. Large: $1.75\n");
        String loadedDecision = myScanner.next();
        loadedDecision = loadedDecision.toLowerCase();


        //check if the person is consent for more loaded
        if(loadedDecision.equals("yes")){
            if(sandwichNumber == 1){
                sandwichPrice1 += 1.00;
            } else if (sandwichNumber == 2) {
                sandwichPrice2 += 1.75;
            }
        }

        //check the customer status student or senior
        System.out.println("If you are Student OR 65 years old or older please enter your age if not enter 0 \n");
        int CustomerAge = myScanner.nextInt();


        //variable for the discount so storing the whole calculate in a single value to make the code clear and adjustable.
        double studentDiscount1 = (sandwichPrice1-(sandwichPrice1-(sandwichPrice1*.10)));
        double studentDiscount2 = (sandwichPrice2-(sandwichPrice2-(sandwichPrice2*.10)));
        double seniorsDiscount1 = (sandwichPrice1-(sandwichPrice1-(sandwichPrice1*.20)));
        double seniorsDiscount2 = (sandwichPrice2-(sandwichPrice2-(sandwichPrice2*.20)));



        //checking and comparing all the status to apply the discount and giving the output
        if(CustomerAge <= 17){
            //applying the discount for students
            if(sandwichNumber == 1 ){
                System.out.printf("The orignal price is: $%.2f\nDiscount is: $%.2f\n",sandwichPrice1, studentDiscount1);
                System.out.printf("The total price: $",(sandwichPrice1-studentDiscount1));
            } else if (sandwichNumber == 2) {
                System.out.printf("The orignal price is: $%.2f\nDiscount is: %.2f\n",sandwichPrice2, studentDiscount2);
                System.out.printf("The total price: $%.2f",(sandwichPrice2-studentDiscount2));
            };
        } else if (CustomerAge >= 65) {
            //applying the discount for seniors
            if(sandwichNumber == 1 ){
                System.out.printf("The orignal price is: $%.2f\n Discount is: $%.2f\n",sandwichPrice1, seniorsDiscount1);
                System.out.printf("The total Price: $%.2f\n",(sandwichPrice1-seniorsDiscount1));
            } else if (sandwichNumber == 2) {
                System.out.printf("The orignal price is: $%.2f \nDiscount is: $%.2f\n", sandwichPrice2, seniorsDiscount2);
                System.out.printf("The total price: $%.2f\n",(sandwichPrice2-seniorsDiscount2));
            };
            
        }else {
            //This the orginal price without any discount
            if(sandwichNumber == 1 ){
                System.out.printf("The total price: $%.2f",sandwichPrice1);
            } else if (sandwichNumber == 2) {
                System.out.printf("The total price: $%.2f",sandwichPrice2);
            };
        }


    }
}
