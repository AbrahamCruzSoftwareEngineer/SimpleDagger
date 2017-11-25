package com.example.simpledagger;

import android.app.Application;
import android.content.Context;

import com.example.simpledagger.Components.ApplicationComponent;
import com.example.simpledagger.Components.DaggerApplicationComponent;
import com.example.simpledagger.Data.DataManager;
import com.example.simpledagger.Modules.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by Albrtx on 24/11/2017.
 */

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context){
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }

}
