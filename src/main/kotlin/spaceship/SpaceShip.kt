package spaceship
import item.Item

interface SpaceShip{
    val cost: Int
    val weight: Int
    val maxWeight: Int

    fun launch(): Boolean
    fun land(): Boolean
    fun canCarry(item: Item): Boolean
    fun carry(item: Item)

    fun printInfo(){
        println("cost: $cost")
        println("weight: $weight")
        println("maxWeight: $maxWeight")
    }
}
