package com.pluralsight;

import java.util.Scanner;

public class LocationBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your fullName: ");
        String fullName = input.nextLine();

        System.out.println("Enter Billing Street: ");
        String BillingStreet = input.nextLine();

        System.out.println("Enter Billing City: ");
        String BillingCity = input.nextLine();

        System.out.println("Enter Billing State: ");
        String BillingState = input.nextLine();

        System.out.println("Enter Billing Zip: ");
        String BillingZip = input.nextLine();

        System.out.println("Enter Shipping Street: ");
        String ShippingStreet = input.nextLine();


        System.out.println("Enter Shipping City: ");
        String ShippingCity = input.nextLine();

        System.out.println("Enter Shipping State: ");
        String ShippingState = input.nextLine();

        System.out.println("Enter Shipping Zip: ");
        String ShippingZip = input.nextLine();

        // ================================================================================

        StringBuilder Address = new StringBuilder();

        Address.append("Billing Address:\n");
        Address.append(BillingStreet).append("\n");
        Address.append(BillingCity).append(", ");
        Address.append(BillingState).append(" ");
        Address.append(BillingZip).append("\n\n");

        System.out.println("Shipping Address:\n");
        Address.append(ShippingStreet).append("\n");
        Address.append(ShippingCity).append(", ");
        Address.append(ShippingState).append(" ");
        Address.append(ShippingZip).append("\n");

        System.out.println(Address);

    }
}
