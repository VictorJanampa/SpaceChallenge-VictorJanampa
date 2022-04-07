import item.Item
import spaceship.Rocket
import spaceship.U1
import spaceship.U2
import java.io.File

class Simulation {

    fun loadItems (textFile:String) :ArrayList<Item> {

        val items: ArrayList<Item> = ArrayList()
        try {
            File(textFile).bufferedReader().use {
                while (true){
                    (it.readLine ()?: break).toItem()?.let { item -> items.add(item)}
                }
            }
        }catch (e: Exception){
            e.printStackTrace()
        }
        return items
    }

    fun loadU1(items: ArrayList<Item>):ArrayList<U1>{

        val rockets: ArrayList<U1> = ArrayList()
        var index=0
        while (index < items.size){
            val u1 = U1()
            while (index < items.size && u1.canCarry(items[index])){
                u1.carry(items[index])
                index++
            }
            rockets.add(u1)
        }
        return rockets
    }
    fun loadU2(items: ArrayList<Item>):ArrayList<U2>{

        val rockets: ArrayList<U2> = ArrayList()
        var index=0
        while (index < items.size){
            val u2 = U2()
            while (index < items.size && u2.canCarry(items[index])){
                u2.carry(items[index])
                index++
            }
            rockets.add(u2)
        }
        return rockets
    }

    fun <T :Rocket>runSimulation(rockets: ArrayList<T>) : Int{
        var budget=0
        rockets.forEach {
            while (!it.launch() || !it.land()) budget+=it.cost
            budget+=it.cost
        }
        return budget
    }

}