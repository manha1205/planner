# planner
Develop a Planner App 

starting off easy:

access java.time.LocalDateTime
access java.util.scanner for user input
develop task class, public class that consists of title, description, bool isCompleted, duedate (use java extension java.time.LocalDateTime)
//in class, use getters ( access info in each of the objects) and setters(for editing task)

planneractions:
three main functions for this class
variable: private list of type task, call it tasks private List<Task> tasks = new ArrayList<>();

viewalltasks(list all tasks with its due date and bool status) //would like to sort by date and then hopefully after by completion
viewtask(take in TaskName(ignore case), for all task in tasks, if TaskName = getTitle(task), return every item in task.) 
addtask(scan user input for date, title, description, completion status, append to list tasks using tasks.add(New task))
deletetask(take in TaskName(ignore case), if TaskName in tasks, clear TaskName?)


still don't know how to display as a weekly calendar for users.


