package model

class Fruits(): Food(){

    init {
        println("Frutas\n" +
                "Selecciona el ingrediente que necesitas:")
    }

    override fun ingredients(): String{
        do{
            println("""
    0. VOLVER
    1. Fresa
    2. Plátano
    3. Uvas
    4. Manzana
    5. Naranja
    6. Pera
    7. Cereza""".trimIndent())

            val selected = readLine()

            when (selected) {
                "0" -> return "0"
                "1" -> return "Fresa"
                "2" -> return "Platano"
                "3" -> return "Uvas"
                "4" -> return "Manzana"
                "5" -> return "Naranja"
                "6" -> return "Pera"
                "7" -> return "Cereza"
                else -> println("Opcion no valida, vuelve a intentarlo")
            }
        }while (true)
    }

}