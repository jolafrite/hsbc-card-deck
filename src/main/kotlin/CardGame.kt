package com.hsbc.cardgame

import com.hsbc.cardgame.domain.models.Deck

open class CardGame

fun main(args: Array<String>) {
    val deck = Deck.init()
    println(deck.toString())

    val shuffledDeck = deck.shuffle()

    assert(deck != shuffledDeck) { "The shuffle didn't seem to work" }

    println(shuffledDeck.toString())
}