import java.time.DayOfWeek;
import java.util.Date;

public class Task {
    public String taskName;
    public Date startDate;
    public Date dueDate;
    public int completionLength;

    public Task(String taskName, Date startDate, Date dueDate, int completionLength) {
        this.taskName = taskName;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.completionLength = completionLength;
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
}
