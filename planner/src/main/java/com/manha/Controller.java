package com.manha;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Controller {
    private List<Task> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run(){
        boolean running = true;
        while (running){
            System.out.println( " 1. Add Task\n 2.Edit Task\n 3. View All Tasks\n 4. Exit ");
            System.out.print(" Enter a choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                addTask();
                break;
                case 2:
                editTask();   
                break;
                case 3:
                displayTasks();
                break;
                case 4:
                running = false;
                System.out.print("Bye Bye");
                break;

                default:
                System.out.println("Invalid input!");
                running = false;
            }
        }
    }
      public void displayTasks(){
        for (int i =0; i < tasks.size(); i++){
            Task task = tasks.get(i);
            System.out.println("Status: "+ (task.isCompleted() ? "Completed": "Not Completed"));
            System.out.println("[ " + (i+1) +"] "+ task.gettitle()+"\n");
            System.out.println("Task details: "+ task.getdescription());
            System.out.println("Due date: "+ task.getDueDate());
        }
    }
    private void addTask(){  
        System.out.println(" Task name: (Enter when done)");
        String title = scanner.nextLine();
        Task task = new Task();
        try{
        task.settitle(title);}
        catch(IllegalArgumentException e){
            System.out.println("Error" + e.getMessage());
         }
         
         DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");

         while(true){
         try {
             System.out.println("Enter due date:  (MM/dd/yyyy HH:mm)");
             String input = scanner.nextLine();
             LocalDateTime dateTime = LocalDateTime.parse(input, format);
            task.setDueDate(dateTime);
            break;
         } catch (DateTimeParseException e) {
            System.out.println("Not a valid format! Try again. MM/dd/yyyy HH:mm");
         }
        }
        System.out.println("Enter a description");
        String description = scanner.nextLine();
        task.setDescription(description);


        tasks.add(task);
    }

    public void editTask(){
        
        displayTasks();
        int index = 0;
        //obtain index for the task I'll edit
        try {
            System.out.println("Enter index of the task to be edited: ");
            int input = scanner.nextInt();
            scanner.nextLine();
            index = input -1;
            if (index< 0 || index >= tasks.size()){
                System.out.println("Wrong input!");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        }
        //retrieve that task
              Task task = tasks.get(index);
        // edit parts of task

        //new title
        System.out.println("Enter a new title (leave blank if no edit!): ");
        String NewTitle = scanner.nextLine();
        if (!NewTitle.trim().isEmpty()){
            task.settitle(NewTitle);
        }

        //edit description
        System.out.println("New description (leave blank if no new changes!): ");
        String NewDescription= scanner.nextLine();
        if(!NewDescription.trim().isEmpty()){
            task.setDescription(NewDescription);
        }
        //New Due date
        System.out.println("Enter due date:  (MM/dd/yyyy HH:mm)");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        String newDue = scanner.nextLine();
        if (!newDue.trim().isEmpty()){
            try {
                LocalDateTime NewDueDate = LocalDateTime.parse(newDue, format);
                task.setDueDate(NewDueDate);
            } catch (Exception e) {
                System.out.println("Invalid date format. Keeping original date.");
            }
        }

        //Update status
        System.out.println("Would you like to mark the task complete? Enter y or n");
        String done= scanner.nextLine().trim().toLowerCase();
        if (done.equals("y")){
            task.completed = true;
            task.setCompleted(task.completed);
            System.out.println("Task successfully marked complete!");
        }
        else if(done.equals("n")){
            task.completed = false;
            task.setCompleted(task.completed);
            System.out.println("Task marked incomplete!");
        }
      
    }
}
