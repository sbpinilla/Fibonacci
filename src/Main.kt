fun main(args: Array<String>) {
    verFibonachi(repeticiones = 18)
}

fun verFibonachi(repeticiones:Int){

    // Inicializar serie
    var contador = 1
    var tem = 0
    var serie = 1

    // Imprimir el cero
    println("(0)Serie 0")

    while ( contador < repeticiones  ){

        // hacer serie actual
        val pp = serie + tem

        // Actualizar serie
        serie = tem

        // Guardar anterior
        tem = pp

        println("($contador)Serie $pp")

        contador++

    }


}