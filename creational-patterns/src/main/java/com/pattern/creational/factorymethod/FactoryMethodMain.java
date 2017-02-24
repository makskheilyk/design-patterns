package com.pattern.creational.factorymethod;

/**
 * Created by max on 2/24/17.
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        MazeGame ordinaryGame = new OrdinaryMazeGame();
        MazeGame magicGame = new MagicMazeGame();
    }
}
