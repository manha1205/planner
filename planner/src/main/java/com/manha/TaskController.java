package com.manha;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    @PostMapping
    public void addTask(@RequestBody Task task) {
        tasks.add(task);
    }

    @GetMapping
    public List<Task> getTasks() {
        return tasks;
    }
}
