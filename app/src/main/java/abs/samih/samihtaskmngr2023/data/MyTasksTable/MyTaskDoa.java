package abs.samih.samihtaskmngr2023.data.MyTasksTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
//2
@Dao
public interface MyTaskDoa {
    @Query("SELECT * FROM MyTask")
    List<MyTask> getAll();

    @Query("SELECT * FROM MyTask WHERE uid IN (:userIds)")
    List<MyTask> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM MyTask WHERE text LIKE :toFind  LIMIT 1")
    MyTask findBy(String toFind);

    @Insert
    void insertAll(MyTask... users);

    @Delete
    void delete(MyTask user);
    @Insert
    void insert(MyTask myTask);
}
