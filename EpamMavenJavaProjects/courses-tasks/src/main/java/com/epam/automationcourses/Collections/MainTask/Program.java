import Creators.CandyCreator;
import Creators.ChocolateCreator;
import Creators.CreatorSweets;
import Gift.Gift;
import Gift.IGift;
import SweetType.ChocolateColour;
import SweetType.TypeCandy;
import Models.Sweet;

import java.util.List;


public class Program {
    public static void main(String[] args) {
        CreatorSweets[] creators = new CreatorSweets[2];
        creators[0] = new CandyCreator();
        creators[1] = new ChocolateCreator();

        IGift gift = new Gift();

        for (CreatorSweets i : creators)
        {
            if (i instanceof CandyCreator)
            {
                Sweet candy = i.createSweets("Rachki", 80, 105, 125, TypeCandy.LOLLIPOP);
                gift.add(candy);
                gift.add(i.createSweets("Chupa-Chups", 25, 75, 70, TypeCandy.LOLLIPOP));
            }

            if (i instanceof ChocolateCreator)
            {
                gift.add(i.createSweets("Alenka", 100, 115, 250, ChocolateColour.WHITECHOCOLATE));
            }
        }

        gift.sort();

        System.out.println();
        List<Sweet> gifts = gift.findCandyBySugar(20, 110);

        for (Sweet item : gifts)
        {
            System.out.println("Название конфеты:" + item.getName() + "Caхар" + item.getSugar());
        }

        System.out.println();
        System.out.println(gift.getGiftWeight());

    }
}
