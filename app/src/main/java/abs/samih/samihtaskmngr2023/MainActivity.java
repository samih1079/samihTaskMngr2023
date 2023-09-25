package abs.samih.samihtaskmngr2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;
import java.util.Random;

import abs.samih.samihtaskmngr2023.data.AppDatabase;
import abs.samih.samihtaskmngr2023.data.MyTasksTable.MyTask;
import abs.samih.samihtaskmngr2023.data.MyTasksTable.MyTaskQuery;
import abs.samih.samihtaskmngr2023.data.usersTable.MyUser;
import abs.samih.samihtaskmngr2023.data.usersTable.MyUserQuery;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db =AppDatabase.getDB(getApplicationContext());

        MyUserQuery myUserDao = db.getMyUserQuery();
        MyUser myUser1 = new MyUser();
        myUser1.email="a@a.com";
        myUser1.fullName="koko wawa";
        myUser1.phone="054666";
        myUser1.passw="s12345";
        myUserDao.insertAll(myUser1);
        List<MyUser> users = myUserDao.getAll();
        for (MyUser myUser : users) {
            Log.d("koko",myUser.toString());
        }

        MyTaskQuery taskQuery=db.getMyTaskQuery();

        MyTask[] arr=new MyTask[5];
        for (MyTask myTask : arr) {
            myTask=new MyTask();
            myTask.importance= (new Random().nextInt(6));
        }

    }


}