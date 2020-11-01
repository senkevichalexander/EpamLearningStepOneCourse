package Gift;

import Models.*;


import java.util.List;

public interface IGift {

        //Iterable<Sweet> Items = new ArrayList<Sweet>();
        void add(Sweet sweet);
        int getGiftWeight();
        void sort();
        List<Sweet> findCandyBySugar(int min, int max);
}
