import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//task class
public class Task{
    String title;
    String description;
    boolean isCompleted;
    LocalDateTime DueDate;
Task(){
    this.title = title;
    this.description = description;
    this.DueDate = DueDate;
    this.isCompleted = false;
}
// getters for accessing(reading) each variable
public String gettitle(){
    return title;
}
public String getdescription(){
    return description;
}
public LocalDateTime getDueDate(){
    return DueDate;
}
public boolean getisCompleted(){
    return isCompleted;
}

//setters: use these to modify items in task
public void settitle(String title){
    if(title== null|| title.trim().isEmpty()){
        throw new IllegalArgumentException(" Must enter a title!");
        
    }
    this.title = title.trim();
}
public void setDescription(String description){
    this.description = description;

}
public void setDueDate(LocalDateTime DueDate){
    DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");

    this.DueDate = DueDate;
}
public void setisCompleted(boolean isCompleted){
    this.isCompleted = isCompleted;
}
}