package org.blackjack.src.main.java.blackjack.model.player;



import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.blackjack.src.main.java.blackjack.model.card.Card;
import org.blackjack.src.main.java.blackjack.model.card.CardBlackjackValue;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
public abstract class Player {
    protected List<Card> hand = new ArrayList<>();

    public void addCard(Card card) {
        hand.add(card);
    }

    public abstract boolean shouldHit();

    public void resetHand() {
        hand.clear();
    }
}

