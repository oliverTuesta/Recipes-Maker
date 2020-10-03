fun main(args: Array<String>){

    do {
        println(
            """
        Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir        
    """.trimIndent()
        )
        val selected = readLine()

        when (selected) {
            "1" -> makeRecipe()
            "2" ->  println("Seleccionaste ver mis Recetas")
            "3" -> println("Gracias por visitarnos")
            else -> println("Opcion no valida, vuelve a intentarlo")
        }
    }while (!selected.equals("3"))
}

fun makeRecipe(){
    do {
        println("""
        Hacer receta
        Selecciona por categoría el ingrediente que buscas
    1. Agua
    2. Leche
    3. Carne
    4. Verduras
    5. Frutas
    6. Cereal
    7. Huevos
    8. Aceites""".trimIndent())

        val selected = readLine()

        when (selected) {
            "1" -> return
            "2" -> return
            "3" -> return
            "4" -> return
            "5" -> return
            "6" -> return
            "7" -> return
            "8" -> return
            else -> println("Opcion no valida, vuelve a intentarlo")
        }
    }while (true)
}

fun viewRecipe(){println("""
        Ver mis recetas
""".trimIndent())}
