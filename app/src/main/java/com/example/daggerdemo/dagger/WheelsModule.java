package com.example.daggerdemo.dagger;

import com.example.daggerdemo.car.Rims;
import com.example.daggerdemo.car.Tyres;
import com.example.daggerdemo.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tyres provideTyres(){
        Tyres tyres = new Tyres();
        tyres.inflate();
        return tyres;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tyres tyres){
        return new Wheels(rims, tyres);
    }


}
