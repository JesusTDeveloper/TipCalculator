/**
 * Función principal que calcula una factura con propina.
 */
fun main() {
    // Solicitar al usuario que ingrese el monto de la compra.
    val monto = getNum("Ingresa el monto de la compra:")
    val tipPercent: Double

    // Bucle para que el usuario seleccione un porcentaje de propina válido.
    while (true) {
        println("Ingresa una opción de propina:\n1) 10%\n2) 15%\n3) 20%")
        val option =  readln()

        when(option) {
            "1" -> {
                tipPercent = 0.1
                break
            }
            "2" -> {
                tipPercent = 0.15
                break
            }
            "3" -> {
                tipPercent = 0.2
                break
            }
            else -> {
                println("Debes ingresar una opción válida")
            }
        }
    }

    // Calcular la factura y mostrar el resultado.
    getTotal(monto, tipPercent)
}

/**
 * Obtiene un número válido del usuario.
 *
 * @param message Mensaje que se mostrará al usuario para solicitar la entrada.
 * @return El número ingresado por el usuario.
 */
fun getNum(message: String): Double {
    while (true) {
        print(message)
        val input = readln()

        // Comprobar si la entrada del usuario es un valor numérico válido.
        if (input.toDoubleOrNull() != null) {
            return input.toDouble()
        } else {
            println("Debes ingresar un valor numérico")
        }
    }
}

/**
 * Calcula la factura e imprime el resultado formateado.
 *
 * @param number Monto de la compra.
 * @param percent Porcentaje de propina.
 */
fun getTotal(number: Double, percent: Double) {
    val tip = number * percent
    val total = number + tip

    // Mostrar la factura con formato.
    println("Factura\nMonto de la cuenta: %.2f$\nPropina: %.2f$\nTotal: %.2f$".format(number, tip, total))
}
