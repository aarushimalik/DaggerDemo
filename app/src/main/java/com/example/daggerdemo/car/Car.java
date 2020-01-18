package com.example.daggerdemo.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    // Field and method will be injected automatically if there is constructor injection
    //Order will be Contructor, Field then Method
    //In activity we are doing different proccess because there is no constructor injection there

    Engine engine;
    Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        Log.d(TAG, "driving the Car, which means we are able to instantiate Car!!! ");
    }


    // Method injection is used very less, only use case, when we need to pass instance of object to dependency
    //And there is no need to call this function, because of @Inject it will be executed after constructor injection
    // and suppose if constructor injection is not present then we will have to do it ourselves like we did it in MainActivity
    // by calling inject function, if constructor injection is present then that is the trigger for both field and method injection


    @Inject
    public void enableRemote(Remote remote){
        remote.setRemote(this);
    }
}
