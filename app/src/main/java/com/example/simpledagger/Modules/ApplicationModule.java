package com.example.simpledagger.Modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.simpledagger.ApplicationContext;
import com.example.simpledagger.DatabaseInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Albrtx on 25/11/2017.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application app){
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName(){
        return "demo-dagger.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() {
        return 2;
    }

    @Provides
    SharedPreferences provideSharedPrefs() {
        return mApplication.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
    }


}
