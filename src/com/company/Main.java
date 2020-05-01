package com.company;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        List<String> shapeList = Arrays.asList("planet", "asteroid", "star");
        Observable<String> observableString = Observable.fromIterable(shapeList);
        observableString.subscribe(new SimpleObserve());
    }
}
