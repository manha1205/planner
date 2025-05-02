package com.manha;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//task class
public class Task{
    private String title;
    private String description;
    public boolean completed;
    private LocalDateTime DueDate;
public Task(){
  
}
   public Task(String title, String description, LocalDateTime dueDate, boolean completed) {
        this.title = title;
        this.description = description;
        this.DueDate = DueDate;
        this.completed = completed;
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
public boolean isCompleted(){
    return completed;
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
public void setCompleted(boolean isCompleted){
    this.completed = completed;
}
}