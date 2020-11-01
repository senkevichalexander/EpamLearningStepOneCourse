package Creators;

import Models.*;
import SweetType.*;

public class CandyCreator extends CreatorSweets {
    @Override
    public Sweet createSweets(String name, int weight, int sugar, int calories, TypeCandy type) {
        return new Candy(name, weight, sugar, calories, type);
    }

    @Override
    public Sweet createSweets(String name, int weight, int sugar, int calories, ChocolateColour colour) {
        throw new UnsupportedOperationException();
    }
}
