import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class controller {
    private List<Task> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run(){
        boolean running = true;
        if (running){
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
            }
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
         System.out.println("Enter date: ");
          

        tasks.add(task);

    }
    private void editTask(){
       return;
    }

   
}
