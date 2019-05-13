package per.chq.dailyroutine.views.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import per.chq.dailyroutine.dagger.DaggerBaseActivity;
import per.chq.dailyroutine.mvpbase.BaseContact;

public class BaseActivity extends DaggerBaseActivity {

    private BaseContact.BasePresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        attachView();
    }

    protected void attachView() {
        if(mPresenter != null){
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        detachView();
        super.onDestroy();
    }

    protected void detachView() {
        if(mPresenter != null){
            mPresenter.detachView();
        }
    }
}
