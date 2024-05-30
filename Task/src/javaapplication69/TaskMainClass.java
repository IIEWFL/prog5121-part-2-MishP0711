/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

import java.util.ArrayList;
import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TaskMainClass {
    
    public static boolean checkTaskDescription(String taskDescription) {
        
        if (taskDescription != null && taskDescription.length() > 50) {
            
            return true;
            
        }
        return false;
    }
    
    public static double returnTotalHours(List<Task> tasks) {
        double totalHours = 0;
        for (Task task : tasks) {
            totalHours += task.getTaskDuration();
            
        }
        return totalHours;
        
    }
    
    public static int menu() {
        
        int selection;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to EasyKanBan\n");
        System.out.println("Menu Options:");
        System.out.println("1 - Add Tasks");
        System.out.println("2 - Show Report");
        System.out.println("3 - Quit");
        System.out.println("Choose an Option?");
        try {
            
            selection = input.nextInt();
            
        } catch (Exception e) {
            selection = 0;
        }
        return selection;
    }
    
    public static boolean enterToContinue() {
        Scanner s = new Scanner(System.in);
        System.out.println("Press Enter to continue");
        return s.hasNextLine();
    }
    
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        
        int userChoice = menu();
        while (userChoice > 0) {
            switch (userChoice) {
                
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter task status (To Do, Done, Doing):");
                    String taskStatus = scanner.nextLine();
                    
                    System.out.println("Input Developer Name (Name and Surname):");
                    String developerName = scanner.nextLine();
                    
                    System.out.println("Enter task name:");
                    
                    String taskName = scanner.nextLine();
                    
                    System.out.println("Enter task description:");
                    String taskDescription = scanner.nextLine();
                    
                    if (checkTaskDescription(taskDescription)) {
                        System.out.println("Please enter a task description of less than 50 characters:");
                    }
                    
                    System.out.println("Enter task duration in hours:");
                    double taskDuration = scanner.nextDouble();
                    
                    int taskNumber = (int) Math.random();
                    
                    Task newTask = new Task(taskName, taskDescription, developerName, taskDuration, taskNumber, taskStatus);
                    tasks.add(newTask);
                    System.out.println(newTask.printTaskDetails());
                    if (enterToContinue()) {
                        System.out.println("Total hours across all tasks: " + returnTotalHours(tasks) + " hours" + "\n");
                    }
                    if (enterToContinue()) {
                        userChoice = menu();
                    }
                case 2:
                    System.out.println("Coming Soon\n");
                    if (enterToContinue()) {
                        userChoice = menu();
                    }
                    break;
                case 3:
                    System.exit(0);
                
                default:
                    System.out.println("Invaild Option");
                    break;
                
            }
        }
    }
}
