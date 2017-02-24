package com.pattern.creational.abstractfactory;

/**
 * Created by max on 2/24/17.
 */
public class OSXFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new OSXButton();
    }
}
