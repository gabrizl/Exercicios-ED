package question01;
public class Task {
    private String name;
    private boolean isCompleted;
    private Task next;

    public Task(String name) {
        this.name = name;
        this.isCompleted = false;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Task getNext() {
        return next;
    }

    public void setNext(Task next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return name + (isCompleted ? " (Concluída)" : "");
    }
}
