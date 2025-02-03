package collection.compare.mytest;

import java.util.ArrayList;
import java.util.List;

public class CardGameMain {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();
        deck.shuffle();

        List<Card> player1 = new ArrayList<>(5);
        List<Card> player2 = new ArrayList<>(5);

        pullCards(player1, deck);
        pullCards(player2, deck);

        result(player1, player2);

    }

    private static void result(List<Card> player1, List<Card> player2) {
        player1.sort(null);
        player2.sort(null);

        int player1Score = score(player1);
        int player2Score = score(player2);

        System.out.println("플레이어1의 카드 : " + player1 + ", 합계: " + player1Score);
        System.out.println("플레이어2의 카드 : " + player2 + ", 합계: " + player2Score);

        String winner = player1Score > player2Score ? "플레이어1 승리" : (player1Score == player2Score) ? "무승부" : "플레이어2 승리";

        System.out.println(winner);
    }

    private static int score(List<Card> player) {
        int result = 0;
        for(Card card : player) {
            result += card.getNumber();
        }
        return result;
    }

    private static void pullCards(List<Card> player, Deck deck) {
        for(int i=0; i<5; i++) {
            player.add(deck.cards.removeLast());
        }
    }

}
