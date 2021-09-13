/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex10;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String itemOne = input.nextLine();
        int item1 = Integer.parseInt(itemOne);
        System.out.print("Enter the quantity of item 1: ");
        String quantityOne = input.nextLine();
        int quantity1 = Integer.parseInt(quantityOne);
        System.out.print("Enter the price of item 2: ");
        String itemTwo = input.nextLine();
        int item2 = Integer.parseInt(itemTwo);
        System.out.print("Enter the quantity of item 2: ");
        String quantityTwo = input.nextLine();
        int quantity2 = Integer.parseInt(quantityTwo);
        System.out.print("Enter the price of item 3: ");
        String itemThree = input.nextLine();
        int item3 = Integer.parseInt(itemThree);
        System.out.print("Enter the quantity of item 3: ");
        String quantityThree = input.nextLine();
        int quantity3 = Integer.parseInt(quantityThree);

        double subtotal = (item1*quantity1)+(item2*quantity2)+(item3*quantity3);
        double tax = subtotal*0.055;
        double total = subtotal+tax;

        System.out.print("Subtotal: $"+String.format("%.2f",subtotal)+"\nTax: $"+tax+"\nTotal: $"+total);

    }
}
