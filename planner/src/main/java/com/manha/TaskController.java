package com.manha;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

  @PostMapping
public void addTask(@RequestBody Task task) {
    System.out.println("Added task: " + task.gettitle() + " - " + task.getdescription());
    tasks.add(task);
}

    @GetMapping
    public List<Task> getTasks() {
        return tasks;
    }
}
