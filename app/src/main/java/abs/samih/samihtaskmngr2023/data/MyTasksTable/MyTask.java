package abs.samih.samihtaskmngr2023.data.MyTasksTable;


import androidx.room.Entity;
import androidx.room.PrimaryKey;
//1
@Entity
public class MyTask {
    @PrimaryKey(autoGenerate = true)
    public long keyid;

    public long subjkeyId;
    public long userkeyId;

    public long time;
    public int importance;
    public String text;
    public boolean isCompleted;

    @Override
    public String toString() {
        return "MyTask{" +
                "keyid=" + keyid +
                ", subjkeyId=" + subjkeyId +
                ", userkeyId=" + userkeyId +
                ", dateTime=" + time +
                ", importance=" + importance +
                ", text='" + text + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}