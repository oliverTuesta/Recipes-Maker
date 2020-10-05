package model

class Grain() : Food(){

    init {
        println("Cereales")
    }

    override fun getIngredient(): String{
        do {
            println("""
Selecciona el Ingrediente que necesitas:
    0. VOLVER
    1. Avena
    2. Trigo
    3. Arroz
    4. Maiz
""".trimIndent())
            val selected = readLine()

            when(selected){
                "0" -> return "0"
                "1" -> return "Avena"
                "2" -> return "Trigo"
                "3" -> return "Arroz"
                "4" -> return "Maiz"
            }
        }while (true)
    }

}