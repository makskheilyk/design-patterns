package com.pattern.creational.abstractfactory;

/**
 * Created by max on 2/24/17.
 */
public class AbstractFactoryMain {

    public static void main(String[] args) throws Exception {
        IGUIFactory factory = null;

        String appearance = randomAppearance();//current operating system
        if (appearance.equals("osx")) {
            factory = new OSXFactory();
        } else if(appearance.equals("windows")) {
            factory = new WinFactory();
        } else {
            throw new Exception("No such operating system");
        }

        IButton button = factory.createButton();
        button.paint();

    }

    /**
     * This is just for the sake of testing this program, and doesn't have to do
     * with Abstract Factory pattern.
     * @return
     */
    public static String randomAppearance() {
        String[] appearanceArr = new String[3];
        appearanceArr[0] = "osx";
        appearanceArr[1] = "windows";
        appearanceArr[2] = "error";
        java.util.Random rand = new java.util.Random();
        int randNum = rand.nextInt(3);
        return appearanceArr[randNum];
    }

}
