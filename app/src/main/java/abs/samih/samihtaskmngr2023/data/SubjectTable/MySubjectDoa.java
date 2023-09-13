package abs.samih.samihtaskmngr2023.data.SubjectTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
//2
@Dao
public interface MySubjectDoa {
    @Query("SELECT * FROM MySubject")
    List<MySubject> getAll();

    @Query("SELECT * FROM MySubject WHERE uid IN (:userIds)")
    List<MySubject> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM MySubject WHERE title LIKE :first LIMIT 1")
    MySubject findByTitle(String first);

    @Insert
    void insertAll(MySubject... users);

    @Delete
    void delete(MySubject user);

    @Query("Delete From MySubject WHERE uid=:id ")
    void delete(int id);
    @Insert
    void insert(MySubject mySubject);
}
