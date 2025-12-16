package com.hsbc.cardgame

import com.hsbc.cardgame.domain.models.Deck
import javax.naming.spi.ObjectFactory

//Each Card should have two properties with the listed values
//  Rank - A,2,3,4,5,6,7,8,9,10,J,Q,K
//  Suit - Heart, Club, Spade, Diamonds
//
//Write a method in the Deck class such that the cards are printed.
//Write a method in the Deck class such that the order of the cards is shuffled.
open class CardGame

fun main(args: Array<String>) {
    val deck = Deck.init()
    println(deck.toString())

    val shuffledDeck = deck.shuffle()

    assert(deck != shuffledDeck) { "The shuffle didn't seem to work" }

    println(shuffledDeck.toString())
}