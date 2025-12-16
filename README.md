# Card Deck

Simple card deck implementation in Kotlin and Gradle.

Each `Card` has two properties:
- `Rank` — A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
- `Suit` — Heart, Club, Spade, Diamonds

This project provides a `Deck` class that:
- constructs a standard 52-card deck
- prints the cards (one per line, e.g. `A of Hearts`)
- shuffles the cards (randomizes order)

## Result

> Task :com.hsbc.cardgame.CardGameKt.main()
Deck information:
There are 52 cards
A - club
2 - club
3 - club
4 - club
5 - club
6 - club
7 - club
8 - club
9 - club
10 - club
J - club
Q - club
K - club
A - diamond
2 - diamond
3 - diamond
4 - diamond
5 - diamond
6 - diamond
7 - diamond
8 - diamond
9 - diamond
10 - diamond
J - diamond
Q - diamond
K - diamond
A - heart
2 - heart
3 - heart
4 - heart
5 - heart
6 - heart
7 - heart
8 - heart
9 - heart
10 - heart
J - heart
Q - heart
K - heart
A - spade
2 - spade
3 - spade
4 - spade
5 - spade
6 - spade
7 - spade
8 - spade
9 - spade
10 - spade
J - spade
Q - spade
K - spade

Deck information:
There are 52 cards
4 - club
9 - diamond
5 - spade
Q - club
K - club
4 - diamond
7 - heart
Q - spade
A - diamond
7 - club
3 - club
4 - spade
A - club
8 - diamond
2 - spade
10 - spade
J - diamond
A - heart
10 - diamond
4 - heart
5 - diamond
K - heart
2 - heart
9 - heart
3 - diamond
J - club
A - spade
2 - diamond
3 - heart
J - heart
Q - diamond
6 - spade
6 - club
9 - club
J - spade
9 - spade
10 - heart
Q - heart
K - spade
10 - club
6 - heart
7 - diamond
6 - diamond
2 - club
5 - club
5 - heart
8 - club
3 - spade
K - diamond
8 - spade
7 - spade
8 - heart
