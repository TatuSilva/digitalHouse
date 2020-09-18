package br.digitalHouse.Aula6.Ingresso

open class Normal (valor: Double): Ingresso(valor) {
    override fun imprime () {
        println("Ingresso Normal \n Valor: $valor")
    }
}