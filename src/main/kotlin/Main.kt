
fun main(args: Array<String>) {

    val textFile = listOf("phase-1.txt","phase-2.txt")

    val simulation = Simulation()

    // Read items for both phases
    val itemsPhase1 = simulation.loadItems(textFile[0])
    val itemsPhase2 = simulation.loadItems(textFile[1])

    // Load items for both phases
    val u1rocketsPhase1 = simulation.loadU1(itemsPhase1)
    val u1rocketsPhase2 = simulation.loadU1(itemsPhase2)

    val u2rocketsPhase1 = simulation.loadU2(itemsPhase1)
    val u2rocketsPhase2 = simulation.loadU2(itemsPhase2)

    //Show simulations results
    val printPhase = { phase: Int, rocketType: String, budget: Int ->
        println("Budget phase $phase for $rocketType : $budget")
    }

    printPhase(1, "U1",simulation.runSimulation(u1rocketsPhase1))
    printPhase(2, "U1",simulation.runSimulation(u1rocketsPhase2))
    printPhase(1, "U2",simulation.runSimulation(u2rocketsPhase1))
    printPhase(2, "U2",simulation.runSimulation(u2rocketsPhase2))

}