package com.manha;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

  @PostMapping
public void addTask(@RequestBody Task task) {
    System.out.println("Added task: " + task.gettitle() + " - " + task.getdescription());
    System.out.println("Completed: " + task.isCompleted()); // 
    tasks.add(task);
}

    @GetMapping
    public List<Task> getTasks() {
        return tasks;
    }
    @PutMapping("/{title}")
    public void updateTask(@PathVariable String title, @RequestBody Task updatedTask) {
        for (Task task : tasks) {
            if (task.gettitle().equals(title)) {
                task.setDescription(updatedTask.getdescription());
                task.setDueDate(updatedTask.getDueDate());
                task.setCompleted(updatedTask.isCompleted());  // ← Make sure this is included
                return;
            }
        }
    }
    @DeleteMapping("/{title}")
    public void deleteTask(@PathVariable String title) {
        tasks.removeIf(task -> task.gettitle().equalsIgnoreCase(title));
    }
}
