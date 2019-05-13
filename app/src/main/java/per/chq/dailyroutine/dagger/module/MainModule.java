package per.chq.dailyroutine.dagger.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import per.chq.dailyroutine.views.MainActivity;

@Module
public class MainModule {

    @Named("hometext")
    @Provides
    public String provideHomeText(MainActivity activity){
        return "Test Dagger";
    }

}
