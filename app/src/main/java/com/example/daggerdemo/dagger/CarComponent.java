package com.example.daggerdemo.dagger;

import com.example.daggerdemo.MainActivity;
import com.example.daggerdemo.car.Car;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
