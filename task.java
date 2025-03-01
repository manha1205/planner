import java.time.LocalDateTime;
import java.util.Scanner;

public class task{
    String title;
    String description;
    boolean isCompleted;
    LocalDateTime DueDate;
task(){
    this.title = title;
    this.description = description;
    this.DueDate = DueDate;
    this.isCompleted = false;
}
// getters for accessing(reading) each variable
public String gettitle(String title){
    return title;
}
public String getdescription(String description){
    return description;
}
public LocalDateTime getDueDate(LocalDateTime DueDate){
    return DueDate;
}
public boolean getisCompleted(boolean isCompleted){
    return isCompleted;
}

//setters: use these to modify items in task
public void settitle(String title){
    if(title== null){
        System.out.println("Not a valid title");
        
    }
    this.title = title;
}
}