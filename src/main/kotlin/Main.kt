fun main() {

    val rectangulo1 = Rectangulo(5.0, 10.0)
    val rectangulo2 = Rectangulo(3.0, 7.0)
    val rectangulo3 = obtenerDatosRectangulo()

    println(rectangulo1)
    println(rectangulo2)
    println(rectangulo3)

    println("Área del rectángulo 1: ${rectangulo1.calcularArea()}")
    println("Perímetro del rectángulo 1: ${rectangulo1.calcularPerimetro()}")

    println("Área del rectángulo 2: ${rectangulo2.calcularArea()}")
    println("Perímetro del rectángulo 2: ${rectangulo2.calcularPerimetro()}")

    println("Área del rectángulo 3: ${rectangulo3.calcularArea()}")
    println("Perímetro del rectángulo 3: ${rectangulo3.calcularPerimetro()}")
}
