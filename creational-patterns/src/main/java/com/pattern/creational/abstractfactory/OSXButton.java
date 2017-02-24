package com.pattern.creational.abstractfactory;

/**
 * Created by max on 2/24/17.
 */
public class OSXButton implements IButton {
    @Override
    public void paint() {
        System.out.println("OSX button");
    }
}