package kg.geektech.courses.android3.lesson1sept.ui.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import kg.geektech.courses.android3.lesson1sept.App;
import kg.geektech.courses.android3.lesson1sept.R;
import kg.geektech.courses.android3.lesson1sept.data.local.PreferenceUtils;
import kg.geektech.courses.android3.lesson1sept.ui.main.MainActivity;

public class UserinfoActivity
        extends AppCompatActivity
        implements View.OnClickListener {

    Button logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
        TextView userName = findViewById(R.id.textView);
        userName.setText(PreferenceUtils.getUserN());

        logOut = findViewById(R.id.log_out_btn);

        logOut.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        PreferenceUtils.deleteUserName();
        PreferenceUtils.deleteUser();
        Log.d("TAG","name" + PreferenceUtils.getUserName());
        startActivity(new Intent(this,MainActivity.class));
    }
}