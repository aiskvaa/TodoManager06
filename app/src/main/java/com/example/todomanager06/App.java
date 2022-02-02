package com.example.todomanager06;

import android.app.Application;

import androidx.room.Room;

import com.example.todomanager06.room.AppDataBase;

public class App extends Application {
    public static App app;
    AppDataBase db;

    public static App getApp() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        db = Room.databaseBuilder(getApplicationContext(), AppDataBase.class, "database").allowMainThreadQueries().build();
    }

    public AppDataBase getDb() {
        return db;
    }
}