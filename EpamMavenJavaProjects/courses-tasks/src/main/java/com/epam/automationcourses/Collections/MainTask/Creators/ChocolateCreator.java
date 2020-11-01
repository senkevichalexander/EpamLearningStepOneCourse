package Creators;


import Models.*;
import SweetType.*;

public class ChocolateCreator extends CreatorSweets {

    @Override
    public Sweet createSweets(String name, int weight, int sugar, int calories, TypeCandy type) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Sweet createSweets(String name, int weight, int sugar, int calories, ChocolateColour colour) {
        return new Chocolate(name, weight, sugar, calories, colour);
    }
}
