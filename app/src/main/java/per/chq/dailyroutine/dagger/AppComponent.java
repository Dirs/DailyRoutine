package per.chq.dailyroutine.dagger;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import per.chq.dailyroutine.dagger.module.AllActivityModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AndroidSupportInjectionModule.class,AllActivityModule.class})
public interface AppComponent{
     void inject(DaggerBaseApplication app);
}
