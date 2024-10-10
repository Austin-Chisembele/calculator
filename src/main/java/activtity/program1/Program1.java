/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package activtity.program1;

import java.util.ArrayList;
import java.util.Scanner;

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
        
        //github demo
        // Initialize empty lists
        ArrayList<String> developers = new ArrayList<>();
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Integer> durations = new ArrayList<>();
        ArrayList<String> statuses = new ArrayList<>();

        // Populate lists with user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many tasks would you like to add? ");
        int numTasks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numTasks; i++) {
            System.out.print("Enter developer name: ");
            developers.add(scanner.nextLine());
            System.out.print("Enter task name: ");
            tasks.add(scanner.nextLine());
            System.out.print("Enter task duration: ");
            durations.add(Integer.valueOf(scanner.nextLine()));
            System.out.print("Enter task status (done/in progress/not started): ");
            statuses.add(scanner.nextLine());
             System.out.println("================================================="); 
        }

        // Display information for all tasks with status of 'done'
        System.out.println("\nTasks with status 'done':");
        for (int i = 0; i < numTasks; i++) {
            if (statuses.get(i).equals("done")) {
                System.out.printf("Developer: %s, Task Name: %s, Task Duration: %d%n", developers.get(i), tasks.get(i), durations.get(i));
            }
        }

        // Display information for task with longest duration
        int longestTaskIndex = durations.indexOf(durations.stream().max(Integer::compare).orElse(0));
        System.out.printf("\nTask with longest duration: Developer: %s, Duration: %d%n", developers.get(longestTaskIndex), durations.get(longestTaskIndex));

        // Search for a task by Task Name and display details
        System.out.print("\nEnter task name to search: ");
        String searchTaskName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < numTasks; i++) {
            if (tasks.get(i).equals(searchTaskName)) {
                found = true;
                System.out.printf("Task Name: %s, Developer: %s, Status: %s%n", tasks.get(i), developers.get(i), statuses.get(i));
            }
        }
        if (!found) {
            System.out.println("Task not found.");
        }

        // Search for all tasks assigned to a specific Developer
        System.out.print("\nEnter developer name to search: ");
        String searchDeveloper = scanner.nextLine();
        found = false;
        for (int i = 0; i < numTasks; i++) {
            if (developers.get(i).equals(searchDeveloper)) {
                found = true;
                System.out.printf("Task Name: %s, Status: %s%n", tasks.get(i), statuses.get(i));
            }
        }
        if (!found) {
            System.out.println("No tasks assigned to this developer.");
        }
//////////////////////////////////////////
        // Delete a task by Task Name
        System.out.print("\nEnter task name to delete: ");
        String deleteTaskName = scanner.nextLine();
        if (tasks.contains(deleteTaskName)) {
            int indexToDelete = tasks.indexOf(deleteTaskName);
            developers.remove(indexToDelete);
            tasks.remove(indexToDelete);
            durations.remove(indexToDelete);
            statuses.remove(indexToDelete);
            System.out.printf("%s deleted successfully.%n", deleteTaskName);
        } else {
            System.out.println("Task not found.");
        }

        // Display report with full details of all tasks
        System.out.println("\nFull task report:");
        for (int i = 0; i < numTasks; i++) {
            System.out.printf("Developer: %s, Task Name: %s, Task Duration: %d, Status: %s%n", developers.get(i), tasks.get(i), durations.get(i), statuses.get(i));
        }
        
       
    }
   
    }   
      
