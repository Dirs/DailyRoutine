package per.chq.dailyroutine.presenter;

import java.lang.ref.WeakReference;

import per.chq.dailyroutine.mvpbase.BaseContact;

public class BaseRxPresenter<T extends BaseContact.BaseView> implements BaseContact.BasePresenter<T> {

    private WeakReference<T> mWeakReference;

    @Override
    public void attachView(T view) {
        if(mWeakReference != null){
            mWeakReference.clear();
            mWeakReference = null;
        }
        mWeakReference = new WeakReference<>(view);
    }

    @Override
    public void detachView() {
        if(mWeakReference != null){
            mWeakReference.clear();
            mWeakReference = null;
        }
    }
    //FIXME
}
