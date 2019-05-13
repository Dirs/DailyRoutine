package per.chq.dailyroutine;

import javax.inject.Inject;

import dagger.Lazy;
import io.objectbox.BoxStore;
import per.chq.dailyroutine.dagger.DaggerBaseApplication;
import per.chq.dailyroutine.entity.MyObjectBox;

public class MyApplication extends DaggerBaseApplication {

    private BoxStore mBoxStore;

    @Override
    public void onCreate() {
        super.onCreate();
        mBoxStore = MyObjectBox.builder().androidContext(this).build();
    }

    public BoxStore getBoxStore(){
        return mBoxStore;
    }
}
