/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

import javax.swing.*;
import java.util.Objects;

public class Task {

    private String taskStatus;
    private String developerName;
    private String taskName;
    private String taskDescription;
    private int taskNumber;
    private double taskDuration;

    public Task(String taskName, String taskDescription, String developerName, double taskDuration, int taskNumber, String taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerName = developerName;
        this.taskDuration = taskDuration;
        this.taskNumber = taskNumber;
        this.taskStatus = taskStatus;
    }

    public String createTaskID() {
        return Objects.requireNonNull(taskName).substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + Objects.requireNonNull(developerName).substring(0, 3).toUpperCase();
    }

    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n"
                + "Developer Details: " + developerName + "\n"
                + "Task Number: " + taskNumber + "\n"
                + "Task Name: " + taskName + "\n"
                + "Task Description: " + taskDescription + "\n"
                + "Task ID: " + createTaskID() + "\n"
                + "Task Duration: " + taskDuration + " hours\n";
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        taskStatus = taskStatus;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        developerName = developerName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        taskDescription = taskDescription;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        taskNumber = taskNumber;
    }

    public double getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(double taskDuration) {
        taskDuration = taskDuration;
    }

  
}
