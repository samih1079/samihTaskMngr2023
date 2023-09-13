package abs.samih.samihtaskmngr2023.data.usersTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
//2
@Dao
public interface MyUserDoa {
    @Query("SELECT * FROM MyUser")
    List<MyUser> getAll();

    @Query("SELECT * FROM MyUser WHERE uid IN (:userIds)")
    List<MyUser> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM MyUser WHERE first_name LIKE :first AND " +
            "lastName LIKE :last LIMIT 1")
    MyUser findByName(String first, String last);

    @Insert
    void insertAll(MyUser... users);

    @Delete
    void delete(MyUser user);

    @Query("Delete From MySubject WHERE uid=:id ")
    void delete(int id);

    @Insert
    void insert(MyUser myUser);
}
