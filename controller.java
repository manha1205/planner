import com.sun.source.util.TaskListener;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.text.DateFormatter;

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
         System.out.println("Enter date: (MM/dd/yyyy HH:mm)");
         DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");

      
         try {
             System.out.println("Enter due date:  (MM/dd/yyyy HH:mm)");
             String input = scanner.nextLine();
             LocalDateTime dateTime = LocalDateTime.parse(input, format);
            task.setDueDate(dateTime);
         } catch (DateTimeParseException e) {
            System.out.println("Not a valid format! Try again. MM/dd/yyyy HH:mm");
         }
        System.out.println("Enter a description");
        String description = scanner.nextLine();
        task.setDescription(description);

        tasks.add(task);

    }
    private void editTask(){
        //display
        //edit options
    
       return;
    }

   
}
