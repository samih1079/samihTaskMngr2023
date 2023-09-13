package abs.samih.samihtaskmngr2023.data.MyTasksTable;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
//1
@Entity
public class MyTask {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    public int subjId;
    public int importance;
    public String text;
    public boolean isCompleted;

    public MyTask(int subjId, int importance, String text, boolean isCompleted) {
        this.subjId = subjId;
        this.importance = importance;
        this.text = text;
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "uid=" + uid +
                ", subjId=" + subjId +
                ", importance=" + importance +
                ", text='" + text + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}