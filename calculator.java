package javaProjects;

import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String num1 = "", num2= "";

        int number1 = 0, number2 = 0;

        while (num1 == "") {

            System.out.print("Enter first number: ");

            try {
                num1 = sc.nextLine();
                number1 = Integer.parseInt(num1);
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                num1 = "";
            }

        }

        while (num2 == "") {

            System.out.print("Enter Second number: ");

            try {
                num2 = sc.nextLine();
                number2 = Integer.parseInt(num2);
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                num2 = "";
            }

        }

        char opt;
        double result = 0;

        do {

            System.out.println("A. Addition\nB. Subtraction\nC. Multiplication\nD. Division");
            System.out.print("Choose Operation: ");
            opt = sc.nextLine().charAt(0);

    
            if (opt != 'A' && opt != 'a' &&
             opt != 'B' && opt != 'b' &&
              opt != 'C' && opt != 'c' &&
               opt != 'D' && opt != 'd') {

                System.out.println("Invalid choice. Please choose 'A', 'B', 'C', or 'D'.");
    
            }
            
        } while (opt != 'A' && opt != 'a' &&
         opt != 'B' && opt != 'b' &&
          opt != 'C' && opt != 'c' &&
           opt != 'D' && opt != 'd');

           switch(opt) {
            case 'A':
            case 'a':
                // Addition
                result = add(number1, number2);
                break;
                
            case 'B':
            case 'b':
                // Subtraction
                result = sub(number1, number2);
                break;
                
            case 'C':
            case 'c':
                // Multiplication
                result = mult(number1, number2);
                break;
                
            case 'D':
            case 'd':
                // Division
                if (number2 != 0) {
                    result = div(number1, number2);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
        }

        System.out.println("Result: " + result);

        sc.close();

    }

    public static double add(int number1, int number2){
        double result = number1 + number2;
        return result;
    }

    public static double sub(int number1, int number2){
        double result = number1 - number2;
        return result;
    }

    public static double mult(int number1, int number2){
        double result = number1 * number2;
        return result;
    }

    public static double div(int number1, int number2){
        double result = (double) number1 / number2;
        return result;
    }

}
