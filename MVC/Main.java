// ==========================================
// 1. MODEL: Manages data and business logic
// ==========================================
class Task {
    private String title;
    private boolean isCompleted;

    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    // Business rule: Toggle task status
    public void markAsCompleted() {
        this.isCompleted = true;
    }
}

// ==========================================
// 2. VIEW: Manages user interface display
// ==========================================
class TaskView {
    public void displayTaskDetails(String taskTitle, boolean isCompleted) {
        System.out.println("=== TASK DETAILS ===");
        System.out.println("Title: " + taskTitle);
        System.out.println("Status: " + (isCompleted ? "Completed [X]" : "Pending [ ]"));
        System.out.println("--------------------\n");
    }

    public void showMessage(String message) {
        System.out.println("[UI Notification]: " + message);
    }
}

// ==========================================
// 3. CONTROLLER: Connects Model and View
// ==========================================
class TaskController {
    private Task model;
    private TaskView view;

    public TaskController(Task model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    // Coordinates update request
    public void completeTask() {
        // Step 1: Update model logic
        model.markAsCompleted();
        view.showMessage("Task marked as completed successfully!");

        // Step 2: Update view display
        updateView();
    }

    public void updateView() {
        view.displayTaskDetails(model.getTitle(), model.isCompleted());
    }
}

// ==========================================
// MAIN APP: Simulates user interactions
// ==========================================
public class Main {
    public static void main(String[] args) {
        // Instantiate Model and View
        Task myTask = new Task("Study Object-Oriented Programming");
        TaskView myView = new TaskView();

        // Instantiate Controller
        TaskController controller = new TaskController(myTask, myView);

        // Initial view display
        System.out.println("--- Initial State ---");
        controller.updateView();

        // User action simulation: Completing the task
        System.out.println("--- User Action: Click 'Complete Task' ---");
        controller.completeTask();
    }
}