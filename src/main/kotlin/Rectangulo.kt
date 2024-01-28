class Rectangulo(val base: Double, val altura: Double) {

    init {
        require(base > 0 && altura > 0) { "La base y la altura deben ser mayores que 0" }
    }

    fun calcularArea(): Double {
        return base * altura
    }

    fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }

    override fun toString(): String {
        return "Rectángulo [Base: $base, Altura: $altura]"
    }
}

fun obtenerDatosRectangulo(): Rectangulo {
    print("Introduce la base del rectángulo: ")
    val base = readLine()?.toDoubleOrNull() ?: 0.0

    print("Introduce la altura del rectángulo: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    return Rectangulo(base, altura)
}