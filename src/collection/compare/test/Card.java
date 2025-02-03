package collection.compare.test;

public class Card implements Comparable<Card> {

    private final int rank; // 카드의 숫자
    private final Suit suit; // 카드의 마크

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }


    @Override
    public int compareTo(final Card anotherCard) {
        // 숫자를 먼저 비교하고, 숫자가 같으면 마크를 비교
        if(this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        } else { // ordinal 로 비교 - Enum은 comparable을 이미 구현함.
            return this.suit.compareTo(anotherCard.suit);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
