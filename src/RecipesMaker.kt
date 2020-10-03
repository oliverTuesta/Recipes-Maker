import java.lang.NullPointerException

val numberSelected={ readLine()?.toInt()}

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
        val selected = numberSelected()

        when (selected) {
            1 -> makeRecipe()
            2 ->  println("Seleccionaste ver mis Recetas")
            3 -> println("Gracias por visitarnos")
            else -> println("Escoge una de las opciones")
        }
    }while (selected!=3)
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
        val selected = numberSelected()
    }while (!(selected in (1..8)))
}

fun viewRecipe(){println("""
        Ver mis recetas
""".trimIndent())}
