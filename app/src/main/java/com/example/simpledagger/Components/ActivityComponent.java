package com.example.simpledagger.Components;

import com.example.simpledagger.MainActivity;
import com.example.simpledagger.Modules.ActivityModule;
import com.example.simpledagger.PerActivity;

import dagger.Component;

/**
 * Created by Albrtx on 25/11/2017.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
