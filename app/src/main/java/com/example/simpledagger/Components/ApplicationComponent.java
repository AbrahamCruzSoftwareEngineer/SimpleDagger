package com.example.simpledagger.Components;

import android.app.Application;
import android.content.Context;

import com.example.simpledagger.ApplicationContext;
import com.example.simpledagger.Data.DataManager;
import com.example.simpledagger.Data.DbHelper;
import com.example.simpledagger.Data.SharedPrefsHelper;
import com.example.simpledagger.DemoApplication;
import com.example.simpledagger.Modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Albrtx on 25/11/2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();
}
