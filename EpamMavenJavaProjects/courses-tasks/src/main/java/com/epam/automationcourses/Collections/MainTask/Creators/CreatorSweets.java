package Creators;


import Models.*;
import SweetType.*;

public abstract class CreatorSweets
    {
        public abstract Sweet createSweets(String name, int weight, int sugar, int calories, TypeCandy type);
        public abstract Sweet createSweets(String name, int weight, int sugar, int calories, ChocolateColour colour);
    }
