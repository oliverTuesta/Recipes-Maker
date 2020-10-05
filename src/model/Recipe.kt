package model

class Recipe(val ingredients: Array<List<String>>){

    fun showRecipe(){
        //mostrar frutas
        if (ingredients[1].size>0) {
            println("FRUTAS:")
            ingredients[1].forEach() {
                println("- $it")
            }
        }
        //Mostrar Cereales
        if (ingredients[2].size>0) {
            println("CEREALES:")
            ingredients[2].forEach() {
                println("- $it")
            }
        }
        //mostrar otros ingredientes
        if (ingredients[0].size>0){
            println("OTROS INGREDIENTES:")
            ingredients[0].forEach() {
                println("- $it")
            }
        }
    }

}