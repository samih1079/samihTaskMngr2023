package abs.samih.samihtaskmngr2023.data.MyTasksTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
//2
@Dao
public interface MyTaskQuery {
    @Query("SELECT * FROM MyTask")
    List<MyTask> getAll();

    @Query("SELECT * FROM MyTask WHERE keyid IN (:userIds)")
    List<MyTask> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM MyTask WHERE keyid =:mykeyid AND text LIKE '%'||:toFind||'%'")
    List<MyTask> searchText(String toFind, int mykeyid);

    @Insert
    void insertAll(MyTask... users);
    @Delete
    void delete(MyTask user);
    @Query("Delete From MyTask WHERE keyid=:id ")
    void delete(int id);
    @Insert
    void insert(MyTask myTask);
    @Update
    void update(MyTask...values);
}
