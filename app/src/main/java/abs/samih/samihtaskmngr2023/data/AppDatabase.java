package abs.samih.samihtaskmngr2023.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


import abs.samih.samihtaskmngr2023.data.MyTasksTable.MyTask;
import abs.samih.samihtaskmngr2023.data.MyTasksTable.MyTaskDoa;
import abs.samih.samihtaskmngr2023.data.SubjectTable.MySubject;
import abs.samih.samihtaskmngr2023.data.SubjectTable.MySubjectDoa;
import abs.samih.samihtaskmngr2023.data.usersTable.MyUser;
import abs.samih.samihtaskmngr2023.data.usersTable.MyUserDoa;

//3
@Database(entities = {MyUser.class, MySubject.class, MyTask.class},version = 4)
public abstract class AppDatabase extends RoomDatabase
{
    private static AppDatabase db;
    public abstract MyUserDoa getMyUserDao();
    public abstract MySubjectDoa getMySubjectDoa();
    public abstract MyTaskDoa getMyTaskDoa();

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
