package com.pluralsight;

package com.pluralsight;import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        System.out.println("Enter your firstname: ");        String firstName = scanner.nextLine();        System.out.println("Enter your lastname: ");        String lastName = scanner.nextLine();        printFullName(firstName, lastName);        printWelcomeMessage();        System.out.println("Enter the first number: ");        int firstNumber = scanner.nextInt();        System.out.println("Enter the second number: ");        int secondNumber = scanner.nextInt();        int additionResult = add(firstNumber, secondNumber);        System.out.println(additionResult);    }    public static void printFullName(String firstName, String lastName) {        System.out.println(firstName + " " + lastName);    }    public static void printWelcomeMessage() {        System.out.println("Hello Everyone!");    }    public static int add(int num1, int num2) {        int result = num1 + num2;        return result;    }}





