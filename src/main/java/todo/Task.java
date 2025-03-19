package todo;

public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public void complete() {
        isCompleted = true;
    }

    public void unComplete() {
        isCompleted = false;
    }



    public boolean isCompleted() {
        return isCompleted;
    }

    public String getDescription() {
        String checked = "[ ] ";
        if(isCompleted) {
            checked = "[X] ";
        }
        return checked + description;
    }
}
