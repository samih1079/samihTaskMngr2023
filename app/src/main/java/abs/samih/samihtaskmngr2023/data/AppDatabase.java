package abs.samih.samihtaskmngr2023.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


import abs.samih.samihtaskmngr2023.data.MyTasksTable.MyTask;
import abs.samih.samihtaskmngr2023.data.MyTasksTable.MyTaskQuery;
import abs.samih.samihtaskmngr2023.data.SubjectTable.MySubject;
import abs.samih.samihtaskmngr2023.data.SubjectTable.MySubjectQuery;
import abs.samih.samihtaskmngr2023.data.usersTable.MyUser;
import abs.samih.samihtaskmngr2023.data.usersTable.MyUserDoa;

//3
@Database(entities = {MyUser.class, MySubject.class, MyTask.class},version = 5)
public abstract class AppDatabase extends RoomDatabase
{
    private static AppDatabase db;
    public abstract MyUserDoa getMyUserDao();
    public abstract MySubjectQuery getMySubjectDoa();
    public abstract MyTaskQuery getMyTaskDoa();

    public static AppDatabase getDB(Context context)
    {
        if(db==null)
        {
             db = Room.databaseBuilder(context,
                            AppDatabase.class, "database-name")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return db;
    }
}
