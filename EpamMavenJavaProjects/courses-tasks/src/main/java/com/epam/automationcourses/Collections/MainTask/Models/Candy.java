package Models;


import SweetType.*;

public class Candy extends Sweet {
    public TypeCandy typeCandy;

    public Candy(String name, int weight, int sugar, int calories, TypeCandy type){
        super(name, weight, sugar, calories);
        this.typeCandy = type;
    }

    @Override
    public void TypeSweet() {
        System.out.println(typeCandy);
    }
}
