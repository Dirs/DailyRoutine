package per.chq.dailyroutine.mvpbase;

public interface BaseContact {

    interface BaseView{

    }

    interface BasePresenter<T>{
        void attachView(T view);
        void detachView();
    }
}
