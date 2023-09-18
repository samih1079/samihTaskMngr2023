package abs.samih.samihtaskmngr2023.data.SubjectTable;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
//1
@Entity(primaryKeys = {"keyid" ,"title"})
public class MySubject {

    public long keyid;
    @NonNull
    public String title;

    @Override
    public String toString() {
        return "MySubject{" +
                "uid=" + keyid +
                ", title='" + title + '\'' +
                '}';
    }
}