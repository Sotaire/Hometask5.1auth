package kg.geektech.courses.android3.lesson1sept;

import android.app.Application;

import kg.geektech.courses.android3.lesson1sept.data.local.PreferenceUtils;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        PreferenceUtils.init(this);
    }
}
