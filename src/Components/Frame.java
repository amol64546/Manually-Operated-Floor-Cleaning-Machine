package Components;

import Components.Metal_Rod;

public class Frame {
    private Metal_Rod metalRod;
    public Frame(String rodShape){
        metalRod = new Metal_Rod(rodShape);
        System.out.println("Type of Rod is: "+metalRod.getShape());

    }
}
