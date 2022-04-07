package spaceship

import toKgs
import kotlin.random.Random

class U2(
    cost: Int = 120,
    weight: Int = 18.toKgs(),
    maxWeight: Int = 29.toKgs()
) : Rocket(cost, weight, maxWeight) {

    private var chanceOfLaunchExplosion: Double
        get() = 0.04*(weight.toDouble()/maxWeight.toDouble())
        set(_) {}

    private var chanceOfLandingCrash: Double
        get() = 0.08*(weight.toDouble()/maxWeight.toDouble())
        set(_) {}

    override fun launch(): Boolean {
        return Random.nextDouble(0.0,1.0) > chanceOfLaunchExplosion
    }

    override fun land(): Boolean {
        return Random.nextDouble(0.0,1.0) > chanceOfLandingCrash
    }
}