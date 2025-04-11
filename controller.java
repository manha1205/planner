import java.util.*;

public class controller {
    private List<task> tasks = new ArrayList<>();
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
                addtask();
                break;
                case 2:
                edittask();
                break;
                // case 3:
                // displayTasks();
                // break;
                case 4:
                running = false;
                System.out.print("Bye Bye");
                break;

                default:
                System.out.println("Invalid input!");

            }
        }
     
    }
    private void addtask(){
        System.out.println(" hello");

    }
    private void edittask(){
        return;
    }

   
}
