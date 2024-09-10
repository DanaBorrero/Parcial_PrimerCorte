fun main() {
    var urnas : MutableList<Elecciones> = mutableListOf()
    var internet : MutableList<Elecciones> = mutableListOf()
    var radio : MutableList<Elecciones> = mutableListOf()
    var television : MutableList<Elecciones> = mutableListOf()
    var elec = Elecciones()
    var opc : Int
    var totalVotos : Int = 0
    var totalVotos1 : Int = 0
    var totalVotos2 : Int = 0
    do {
        println("------ Elecciones Premier ------")
        println("Elija la opcion que desea: \n 1. Votar por un candidato" +
                "\n 2. Vaciar las urnas" +
                "\n 3. Total de votos" +
                "\n 4. Costo promedio" +
                "\n 5. Mostrar el ganador" +
                "\n 6. Salir")
        opc = readln().toInt()
        when(opc){
            1 -> {
                        do {
                            var opc1: Int
                            println("---- Votar por un candidato ----")
                            println(
                                "Elija su candidato: \n 1. Candidato 1" +
                                        "\n 2. Candidato 2" +
                                        "\n 3. Candidato 3" +
                                        "\n 4. Regresar al menu anterior"
                            )

                            opc1 = readln().toInt()
                            when (opc1) {
                                1 -> {
                                    elec.crearUrnas()
                                    urnas.add(elec)
                                    println("Usted ha votado por el candidato numero 1")
                                    totalVotos++
                                    do {
                                        var opc2: Int
                                        println(
                                            "¿Que medio tuvo influencia para realizar el voto?: \n 1. Internet" +
                                                    "\n 2. Radio" +
                                                    "\n 3. television" +
                                                    "\n 4. Regresar al menu anterior"
                                        )
                                        opc2 = readln().toInt()
                                        when (opc2) {
                                            1 -> {
                                                elec.costoCampaña(totalVotos, 700000.0)
                                                internet.add(elec)
                                            }

                                            2 -> {
                                                elec.costoCampaña(totalVotos, 200000.0)
                                                radio.add(elec)
                                            }

                                            3 -> {
                                                elec.costoCampaña(totalVotos, 600000.0)
                                                television.add(elec)
                                            }
                                        }

                                    } while (opc2 != 4)
                                    println("Regresando al menu anterior...")
                                }

                                2 -> {
                                    elec.crearUrnas()
                                    urnas.add(elec)
                                    println("Usted ha votado por el candidato numero 2")
                                    totalVotos1++

                                    do {
                                        var opc2: Int
                                        println(
                                            "¿Que medio tuvo influencia para realizar el voto?: \n 1. Internet" +
                                                    "\n 2. Radio" +
                                                    "\n 3. television" +
                                                    "\n 4. Regresar al menu anterior"
                                        )
                                        opc2 = readln().toInt()
                                        when (opc2) {
                                            1 -> {
                                                elec.costoCampaña(totalVotos1, 700000.0)
                                                internet.add(elec)
                                            }

                                            2 -> {
                                                elec.costoCampaña(totalVotos1, 200000.0)
                                                radio.add(elec)
                                            }

                                            3 -> {
                                                elec.costoCampaña(totalVotos1, 600000.0)
                                                television.add(elec)
                                            }
                                        }

                                    } while (opc2 != 4)
                                    println("Regresando al menu anterior...")
                                }

                                3 -> {
                                    elec.crearUrnas()
                                    urnas.add(elec)
                                    println("Usted ha votado por el candidato numero 3")
                                    totalVotos2++
                                    do {
                                        var opc2: Int
                                        println(
                                            "¿Que medio tuvo influencia para realizar el voto?: \n 1. Internet" +
                                                    "\n 2. Radio" +
                                                    "\n 3. television" +
                                                    "\n 4. Regresar al menu anterior"
                                        )
                                        opc2 = readln().toInt()
                                        when (opc2) {
                                            1 -> {
                                                elec.costoCampaña(totalVotos2, 700000.0)
                                                internet.add(elec)
                                            }

                                            2 -> {
                                                elec.costoCampaña(totalVotos2, 200000.0)
                                                radio.add(elec)
                                            }

                                            3 -> {
                                                elec.costoCampaña(totalVotos2, 600000.0)
                                                television.add(elec)
                                            }
                                        }

                                    } while (opc2 != 4)
                                    println("Regresando al menu anterior...")
                                }

                            }
                        } while (opc1 != 4)
                        println("Regresando al menu principal...")
            }
            2 ->{
                println("Vaciando urnas...")
                urnas.clear()
                totalVotos = 0
                totalVotos1 = 0
                totalVotos2 = 0
            }

            3 -> {
                println("* El candidato numero uno cuenta con $totalVotos votos *")
                println("* El candidato numero dos cuenta con $totalVotos1 votos *")
                println("* El candidato numero tres cuenta con $totalVotos2 votos *")

                var suma : Int = totalVotos+totalVotos1+totalVotos2
                println("Votos totales: $suma")
                var por1 : Int = (totalVotos/suma)*100
                var por2 : Int = (totalVotos1/suma)*100
                var por3 : Int = (totalVotos2/suma)*100

                println("* El candidato numero uno cuenta con $totalVotos % porcentaje *")
                println("* El candidato numero dos cuenta con $totalVotos1 % porcentaje *")
                println("* El candidato numero tres cuenta con $totalVotos2 % porcentaje *")

            }
        }

    }while (opc != 6)
}