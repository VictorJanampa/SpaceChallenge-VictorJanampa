package spaceship

import toKgs
import kotlin.random.Random

class U1(
    cost: Int = 100,
    weight: Int = 10.toKgs(),
    maxWeight: Int = 18.toKgs()
) : Rocket(cost, weight, maxWeight) {

    private var chanceOfLaunchExplosion: Double
        get() = 0.05*(weight/maxWeight)
        set(_) {}

    private var chanceOfLandingCrash: Double
        get() = 0.01*(weight/maxWeight)
        set(_) {}

    override fun launch(): Boolean {
        return Random.nextDouble(0.0,1.0) > chanceOfLaunchExplosion
    }

    override fun land(): Boolean {
        return Random.nextDouble(0.0,1.0) > chanceOfLandingCrash
    }
}