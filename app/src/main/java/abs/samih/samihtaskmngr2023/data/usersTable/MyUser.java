package abs.samih.samihtaskmngr2023.data.usersTable;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
//1
@Entity
public class MyUser {
    @PrimaryKey(autoGenerate = true)
    public int uid;
    @ColumnInfo(name = "first_name")
    public String firstName;
    //@ColumnInfo(name = "last_name")
    public String lastName;

    public MyUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Ignore
    public MyUser(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "uid=" + uid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}