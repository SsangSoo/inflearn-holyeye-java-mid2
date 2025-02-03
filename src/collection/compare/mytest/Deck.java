package collection.compare.mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> cards = new ArrayList<>(52);

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Deck() {
        cards.addAll(initCards("\u2660"));
        cards.addAll(initCards("\u2665"));
        cards.addAll(initCards("\u2666"));
        cards.addAll(initCards("\u2663"));
    }

    private List<Card> initCards(String glyph) {
        List<Card> list = new ArrayList<>(13);
        for(int num = 1; num <= 13; num++) {
            list.add(new Card(glyph, num));
        }
        return list;
    }

}
