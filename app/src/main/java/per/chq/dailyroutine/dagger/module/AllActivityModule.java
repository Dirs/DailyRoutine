package per.chq.dailyroutine.dagger.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import per.chq.dailyroutine.views.MainActivity;

@Module
public abstract class AllActivityModule {

    @ContributesAndroidInjector(modules = {MainModule.class})
    abstract MainActivity BinMainActivity();
}
