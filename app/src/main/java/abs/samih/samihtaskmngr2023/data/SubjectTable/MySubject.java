package abs.samih.samihtaskmngr2023.data.SubjectTable;


import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
//1
@Entity
public class MySubject {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    public String title;

    public MySubject(String title) {
        this.title = title;
    }
@Ignore
    public MySubject(int uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MySubject{" +
                "uid=" + uid +
                ", title='" + title + '\'' +
                '}';
    }
}