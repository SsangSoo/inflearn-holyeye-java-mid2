package collection.compare.mytest;

public class Card implements Comparable<Card> {

    private String glyph;
    private int number;

    public Card(String glyph, int number) {
        this.glyph = glyph;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.number, o.number);
    }

    @Override
    public String toString() {
        return number + "(" + glyph + ")";
    }
}