import kotlin.random.Random

class Elecciones (){
    fun crearUrnas(){
        var numUrnas : Int
        numUrnas = Random.nextInt(1,11)
        println("su cabina asignada para votacion es: $numUrnas")
    }

    fun costoCampaña( voto: Int, medio: Double){
        var total: Double
        total = voto*medio
        println("El costo de la campaña por este medio es: $total")
    }

    override fun toString(): String {
        return "Elecciones()"
    }

}