package com.example.daggerdemo.car;

public class Wheels {
    //Scenario 2 - Suppose we are not the owner of Wheels class, it belongs to a Third party app,
    //so we cannot add @Inject in the constructor of wheels, in that case we require module and provides
    //Refer to WheelsModule for the same.


//    @Inject
//    public Wheels() {
//    }

    private Rims rims;
    private Tyres tyres;

    public Wheels(Rims rims, Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
    }
}
