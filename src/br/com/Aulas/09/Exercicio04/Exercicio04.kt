package br.DigitalHouse.Aula09.Exercicio04

class Exercicio04 {
}

fun main() {
    val guardaRoupa = GuardaVolumes()

    println("<--Guardar-->")

    guardaRoupa.guardarPecas("Hering", "Camiseta")
    guardaRoupa.guardarPecas("Luis Vitton", "Bolsa")
    guardaRoupa.guardarPecas("C&A", "Biquini")

    println("<--Mostrar-->")

    guardaRoupa.mostrarPecas()

    println("<--Devolução-->")

    guardaRoupa.devolverPecas(1)


}