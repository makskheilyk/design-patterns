package com.pattern.creational.builder;

/**
 * The builder abstraction.
 *
 * Created by max on 2/24/17.
 */
interface CarBuilder {
    CarBuilder setWheels(final int wheels);

    CarBuilder setColor(final String color);

    Car build();
}