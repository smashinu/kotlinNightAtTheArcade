fun main(){
  
    var Card1 = Card(50)
    var Card2 = Card(70)

}

var CardIdentity = 0

fun IncremenetCardIdentity(): Int{
    CardIdentity++;
    return CardIdentity
}


class Game{

}

class Prize{

}

class Termainl{
}

class Card(val initialBalance: Int){
    var balance: Int
    var Id: Int
    init{
        this.Id = IncremenetCardIdentity()
        this.balance = initialBalance
        println(this.Id)
    }

}