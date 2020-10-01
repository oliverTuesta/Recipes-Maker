fun main(args: Array<String>){

    salir@do {
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
            "1" -> println("Seleccionaste Hacer una Receta")
            "2" -> println("Seleccionaste ver mis Recetas")
            "3" -> println("Gracias por visitarnos")
            else -> println("Escoge una de las opciones")
        }
    }while (!selected.equals("3"))
}