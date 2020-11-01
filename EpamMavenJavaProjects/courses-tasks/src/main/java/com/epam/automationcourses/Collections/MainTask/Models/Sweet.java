package Models;


public abstract class Sweet {
    private String name;
    private int weight;
    private int sugar;
    private int calories;

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    public int getSugar() {
        return sugar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }


    public Sweet(String sweetName, int sweetWeight, int sweetSugar, int sweetCalories) {
        this.name = sweetName;
        this.weight = sweetWeight;
        this.sugar = sweetSugar;
        this.calories = sweetCalories;
    }

    public abstract void TypeSweet();
}
