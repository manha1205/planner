package com.manha;
import java.time.LocalDateTime;
//task class
public class Task{
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime dueDate;
public Task(){
  
}
   public Task(String title, String description, LocalDateTime dueDate, boolean completed) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
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
    return dueDate;
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
public void setDueDate(LocalDateTime dueDate){
   
    this.dueDate = dueDate;
}
public void setCompleted(boolean isCompleted){
    this.completed = isCompleted;
}
}