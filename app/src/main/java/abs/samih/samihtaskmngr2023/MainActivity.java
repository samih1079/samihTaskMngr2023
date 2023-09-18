package abs.samih.samihtaskmngr2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import abs.samih.samihtaskmngr2023.data.AppDatabase;
import abs.samih.samihtaskmngr2023.data.usersTable.MyUser;
import abs.samih.samihtaskmngr2023.data.usersTable.MyUserDoa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db =AppDatabase.getDB(getApplicationContext());

        MyUserDoa myUserDao = db.getMyUserDao();
        myUserDao.insertAll(new MyUser());
        List<MyUser> users = myUserDao.getAll();
        for (MyUser myUser : users) {
            Log.d("koko",myUser.toString());
        }



    }

}