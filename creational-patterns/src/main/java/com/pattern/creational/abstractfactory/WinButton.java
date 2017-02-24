package com.pattern.creational.abstractfactory;

/**
 * Created by max on 2/24/17.
 */
public class WinButton implements IButton {
    @Override
    public void paint() {
        System.out.println("WinButton");
    }
}