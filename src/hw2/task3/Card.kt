package hw2.task3

class Card(private val rank: Rank, private val suit: Suit) : Comparable<Card> {

    override fun toString(): String {
        return "$rank $suit"
    }

    override fun equals(other: Any?): Boolean {
        if (other ==null) return false
        if (other !is Card) {
            return false
        }
        if (this === other) return true
        return rank == other.rank && suit == other.suit
    }

    override fun hashCode(): Int = rank.rankValue * 3 + suit.toString().length * 5

    fun isCardOfStandardDeck(): Boolean {
        return rank.rankValue in 2..14
    }

    private fun isStronger(card : Card): Boolean {
        return suit == card.suit && rank.rankValue > card.rank.rankValue
    }

    fun compare(card1: Card, card2: Card) : Int = card1.compareTo(card2)

    override fun compareTo(other: Card): Int {
        val suitWeight = suit.suitValue
        val otherSuitWeight = other.suit.suitValue
        return if (equals(other)) 0
        else if (suitWeight == otherSuitWeight && !isStronger(other) || (suitWeight < otherSuitWeight)) -1
        else 1
    }
}