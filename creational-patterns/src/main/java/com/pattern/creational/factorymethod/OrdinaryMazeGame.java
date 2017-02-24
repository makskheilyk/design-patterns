package com.pattern.creational.factorymethod;

/**
 * Created by max on 2/24/17.
 */
public class OrdinaryMazeGame extends MazeGame {
    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom();
    }
}