package objects

object CardSuits2 extends Enumeration{
  type CardSuits2 = Value
  val SPADES = Value("♠")
  val HEARTS = Value("♡")
  val DIAMONDS = Value("♢")
  val CLUBS = Value("♣")
  
  def isRed(cardSuit: CardSuits2): Boolean = {
    cardSuit.id == HEARTS.id || cardSuit.id == DIAMONDS.id
  }
}