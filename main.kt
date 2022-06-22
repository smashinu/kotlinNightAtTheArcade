



fun main(){
    var Card1 = Card()
    var Card2 = Card()
    var Game1 = Game(5)
    var Game2 = Game(7)
    var Terminal1 = Terminal()
    var Terminal2 = Terminal()
    Terminal1.addCredits(Card1, 50)
    Game1.play(Card1)
}

var CardIdentity = 0

fun IncremenetCardIdentity(): Int{
    CardIdentity++;
    return CardIdentity
}


class Game(val InCost: Int){
    var Cost: Int

    init{
        this.Cost = InCost
    }

    fun play(Card: Card){
        if(Card.credits > Cost){
            removeCredits(Card, Cost)
            Card.tickets += (0..50).random()
            println("Tickets Awarded: " + Card.tickets)
        }
        else{
            println("Unable to play this game due to inneficient funds")
        }
    }

    fun removeCredits(Card: Card,removalcredits: Int){
        if((Card.credits - removalcredits) < 0){
            Card.credits = 0
        }
        else{
            Card.credits = Card.credits - removalcredits
        }
    }
}

class Prize{
  
}

class Terminal(){
    init{

    }
 

    fun addCredits(Card: Card,addcredits: Int){  
        Card.credits = Card.credits + (addcredits * 2)
        println("Current balance is:" + Card.credits)
    }
}

class Card(){
    var credits: Int
    var Id: Int
    var tickets: Int
    init{
        this.Id = IncremenetCardIdentity()
        this.credits = 0
        this.tickets = 0
    }
}