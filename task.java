import java.time.LocalDateTime;

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
    if(title== null){
        System.out.println("Not a valid title");
        
    }
    this.title = title;
}
public void setDescription(String description){
    this.description = description;

}
public void setDueDate(LocalDateTime DueDate){
    this.DueDate = DueDate;
}
public void setisCompleted(boolean isCompleted){
    this.isCompleted = isCompleted;
}
}