import java.util.Date;

public class Task {
    public String taskName;
    public Date startDate;
    public Date dueDate;
    public int completionLength;
    public int priority;

    public Task(String taskName, Date startDate, Date dueDate, int completionLength, int priority) {
        this.taskName = taskName;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.completionLength = completionLength;
        this.priority = priority;
    }

    public void changeName(String newName) {
        this.taskName = newName;
    }
    public void changeStart(Date newStart) {
        this.startDate = newStart;
    }

    public void changeDue(Date newDue) {
        this.dueDate = newDue;
    }

    public void changeLen(int newLen) {
        this.completionLength = newLen;
    }

    public void changePriority(int newPriority) {
        this.priority = newPriority;
    }
}
