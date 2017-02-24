package com.pattern.creational.builder;

/**
 * Created by max on 2/24/17.
 */
public class CarBuildDirectorMain {
    private CarBuilder builder;

    public CarBuildDirectorMain(final CarBuilder builder) {
        this.builder = builder;
    }

    public Car construct() {
        return builder.setWheels(4).setColor("Red").build();
    }

    public static void main(final String[] arguments) {
        CarBuilder builder = new CarBuilderImpl();
        CarBuildDirectorMain carBuildDirector = new CarBuildDirectorMain(builder);
        System.out.println(carBuildDirector.construct());
    }
}
