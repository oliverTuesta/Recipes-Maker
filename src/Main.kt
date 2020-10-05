import model.Fruits
import model.Grain
import model.Recipe

fun main(args: Array<String>) {

    var recipes: ArrayList<Recipe> = arrayListOf()

    do {
        println(
            """
                
        Selecciona la opción deseada
    0. Salir
    1. Hacer una receta
    2. Ver mis recetas 
    """.trimIndent()
        )
        val selected = readLine()

        when (selected) {
            "0" -> println("Gracias por visitarnos")
            "1" -> {
                val recipe = Recipe(makeRecipe())
                recipes.add(recipe)
            }
            "2" -> {
                println("Seleccionaste ver mis Recetas")
                showRecipes(recipes)
            }

            else -> println("Opcion no valida, vuelve a intentarlo")
        }
    }while (!selected.equals("0"))
}

fun makeRecipe(): Array<List<String>>{

    var typeGrain = listOf<String>()
    var typeFruits = listOf<String>()
    var others = listOf<String>()

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

        finish@when (selected) {
            "0" -> println()
            "1" -> others += "Agua"
            "2" -> others += "Leche"
            "3" -> others += "Carne"
            "4" -> others += "Verduras"
            "5" -> {
                val fruits = Fruits()
                if(!fruits.getIngredient().equals("0")) {
                    typeFruits += fruits.getIngredient()
                println("Escogiste la fruta: ${fruits.getIngredient()}")
            }
            }
            "6" -> {
                val grain = Grain()
                if (!grain.getIngredient().equals("0")){
                    typeGrain += grain.getIngredient()
                    println("Escogiste el cereal: ${grain.getIngredient()}")
                }
            }
            "7" -> others += "Huevos"
            "8" -> others += "Aceite"
            else -> println("Opcion no valida, vuelve a intentarlo")
        }
    }while (!selected.equals("0"))

    val ingredients: Array<List<String>> = arrayOf(others,typeFruits,typeGrain)
    return ingredients

}

fun viewRecipe(){println("""
        Ver mis recetas
""".trimIndent())
}

fun showRecipes(recipes: ArrayList<Recipe>){
    if (recipes.size>0) {
        var count = 0
        recipes.forEach() {
            println("         RECETA $count")
            count++
            it.showRecipe()
        }
    }else{
        println("\nAun no tienes ninguna receta")
    }
}

