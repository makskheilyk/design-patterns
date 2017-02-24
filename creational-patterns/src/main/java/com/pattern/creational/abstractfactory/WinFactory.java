package com.pattern.creational.abstractfactory;

/**
 * Created by max on 2/24/17.
 */
public class WinFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new WinButton();
    }
}