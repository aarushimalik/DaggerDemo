package com.example.daggerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerdemo.car.Car;
import com.example.daggerdemo.dagger.CarComponent;
import com.example.daggerdemo.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
// This field cannot be private as then CarComponent will not be able to access it
    // and it cannot be final as well because then its value cannot be changed
    @Inject
Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //We don't want to create the objects of Engine and wheels as suppose Engine and wheels are further dependent on some other c
        // classes we will have to create their objects first, So we want that Dagger should help us in creating these objects, which is DEpendency Injection
        // Thus we want to eliminate this Boilerplate code writing

//        Engine engine = new Engine();
//        Wheels wheels = new Wheels();
//        Car car = new Car(engine, wheels);

       // car.drive();


        CarComponent carComponent = DaggerCarComponent.create();
        //Constructor Injection
      //  Car car = carComponent.getCar();

        //Field Injection

        //By doing this we are passing our activity to component and telling it that please
        // inject all the fields with @inject present in this activity
        carComponent.inject(this);
        car.drive();
    }
}
