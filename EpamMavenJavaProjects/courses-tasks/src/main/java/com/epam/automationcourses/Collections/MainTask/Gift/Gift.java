package Gift;


import Models.*;


import java.util.*;

public class Gift implements IGift {
    private List<Sweet> items = new ArrayList();

    @Override
    public void add(Sweet sweet) {
        items.add(sweet);
    }

    @Override
    public int getGiftWeight() {
        int weight = 0;

        for (Sweet sweets : items) {
            weight += sweets.getWeight();
        }

        return weight;
    }

    @Override
    public void sort() {
        items.sort(Comparator.comparingInt(Sweet::getWeight));

    }

    @Override
    public List<Sweet> findCandyBySugar(int min, int max) {
        List<Sweet> sugarList = new ArrayList<>();
        for (Sweet sweet : items) {
            if (sweet.getSugar() >= min && sweet.getSugar() <= max) sugarList.add(sweet);
        }

        return sugarList;
    }
}


