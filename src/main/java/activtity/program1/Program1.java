/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package activtity.program1;

import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */

public class Program1 {

    public static void main(String[] args) {
        // Get two numbers from the user
        String val1 = JOptionPane.showInputDialog("Enter the first number:");
        String val2 = JOptionPane.showInputDialog("Enter the second number:");
        
        double num1 = Double.parseDouble(val1);
        double num2 = Double.parseDouble(val2);
        
        while (true) {
            // Display menu options
            String menu = "Choose an option:\n" +
                          "1. Addition\n" +
                          "2. Subtraction\n" +
                          "3. Division\n" +
                          "4. Multiplication\n" +
                          "0. Exit";
            
            String choice = JOptionPane.showInputDialog(menu);
            
            if (choice.equals("0")) {
                
                break;
            }
            
            double result = 0;
            String message = "";
            
            
            switch (choice) {
                case "1":
                    result = num1 + num2;
                    message = "Result of Addition: " + result;
                    break;
                case "2":
                    result = num1 - num2;
                    message = "Result of Subtraction: " + result;
                    break;
                case "3":
                    if (num2 != 0) {
                        result = num1 / num2;
                        message = "Result of Division: " + result;
                    } else {
                        message = "Error: Division by zero!";
                    }
                    break;
                case "4":
                    result = num1 * num2;
                    message = "Result of Multiplication: " + result;
                    break;
                default:
                    message = "Error with the calculation.";
                    break;
            }
            
            // Display the result or error message
            JOptionPane.showMessageDialog(null, message);
        }
        
        // Exit message
        JOptionPane.showMessageDialog(null, "Thanks for using the Calculator.");
    }
   
    }   
      
