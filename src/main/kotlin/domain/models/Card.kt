package com.hsbc.cardgame.domain.models

import com.hsbc.cardgame.domain.enums.CardRank
import com.hsbc.cardgame.domain.enums.CardSuit

data class Card(
    val rank: CardRank,
    val suit: CardSuit,
) {
    override fun toString(): String {
        return "${rank.value} - ${suit.value}"
    }
}