package com.company;


import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class SimpleObserve implements Observer<String> {
    @Override
    public void onSubscribe(Disposable disposable) {
        
    }

    @Override
    public void onNext(String s) {
    System.out.println(s);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
