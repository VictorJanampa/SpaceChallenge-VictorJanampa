package spaceship

import item.Item

open class Rocket(override val cost: Int, final override val weight: Int, final override val maxWeight: Int) : SpaceShip{
    var cargoCarried = 0
    val cargoLimit: Int = maxWeight - weight

    override fun launch(): Boolean {
        return true
    }
    override fun land(): Boolean {
        return true
    }
    override fun canCarry(item: Item): Boolean{
        return cargoLimit>=cargoCarried+item.weight
    }
    override fun carry(item: Item){
        cargoCarried+=item.weight
    }

}