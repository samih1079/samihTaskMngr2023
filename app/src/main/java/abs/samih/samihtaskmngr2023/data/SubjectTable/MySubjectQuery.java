package abs.samih.samihtaskmngr2023.data.SubjectTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

//2
@Dao
public interface MySubjectQuery {
    @Query("SELECT * FROM MySubject")
    List<MySubject> getAll();

    @Query("SELECT * FROM MySubject WHERE keyid IN (:userIds)")
    List<MySubject> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM MySubject WHERE title = :myTitle LIMIT 1")
    MySubject findByTitle(String myTitle);

    @Insert
    void insertAll(MySubject... users);

    @Delete
    void delete(MySubject user);

    @Query("Delete From MySubject WHERE keyid=:id ")
    void delete(int id);
    @Insert
    void insert(MySubject mySubject);
    @Update
    void update(MySubject...values);
}
