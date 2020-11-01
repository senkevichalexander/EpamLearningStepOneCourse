package Models;

import SweetType.*;

import  Creators.*;
    public class Chocolate extends Sweet {
        public ChocolateColour colour;

        public Chocolate(String name, int weight, int sugar, int calories, ChocolateColour colour ){
            super(name, weight, sugar, calories);
            this.colour = colour;
        }

        @Override
        public void TypeSweet() {
            System.out.println(colour);
        }
}
