package com.hsbc.cardgame.domain.models

import com.hsbc.cardgame.domain.enums.CardRank
import com.hsbc.cardgame.domain.enums.CardSuit

class Deck(val cards: List<Card>) {

    fun shuffle(): Deck = Deck(cards.shuffled())

    override fun toString(): String {
        var message = "Deck information:\n"

        message += when (this.cards.size > 1) {
            true -> "There are ${this.cards.size} cards\n"
            else -> "There is ${this.cards.size} card\n"
        }

        for (card in cards) {
            message += "$card\n"
        }

        return message
    }

    companion object {
        fun init(): Deck {
            val cards = ArrayList<Card>()
            for (suit in CardSuit.entries) {
                for (rank in CardRank.entries) {
                    cards.add(Card(rank, suit))
                }
            }
            return Deck(cards)
        }
    }
}