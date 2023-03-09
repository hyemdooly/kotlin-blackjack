package domain.util

import model.cards.Card
import model.cards.Hand
import model.participants.Name
import model.participants.Player

class PlayerBuilder {
    private lateinit var name: Name
    private var hand: Hand = Hand(emptyList())
    fun name(name: Name) {
        this.name = name
    }

    fun hand(card: Card) {
        hand.add(card)
    }

    fun build(): Player = Player(hand, name)
}