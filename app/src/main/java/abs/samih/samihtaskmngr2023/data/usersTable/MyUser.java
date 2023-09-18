package abs.samih.samihtaskmngr2023.data.usersTable;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
//1
@Entity
public class MyUser {
    @PrimaryKey(autoGenerate = true)
    public long keyid;
    @ColumnInfo(name = "fullName")
    public String fullName;
    public String email;
    public String phone;
    public String passw;

    @Override
    public String toString() {
        return "MyUser{" +
                "keyid=" + keyid +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", passw='" + passw + '\'' +
                '}';
    }
}