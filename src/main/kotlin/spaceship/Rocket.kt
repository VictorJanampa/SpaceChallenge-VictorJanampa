package spaceship

import item.Item

open class Rocket(override val cost: Int, override var weight: Int, override val maxWeight: Int) : SpaceShip{

    override fun launch(): Boolean {
        return true
    }
    override fun land(): Boolean {
        return true
    }
    override fun canCarry(item: Item): Boolean{
        return maxWeight>=weight+item.weight
    }
    override fun carry(item: Item){
        weight+=item.weight
    }

}