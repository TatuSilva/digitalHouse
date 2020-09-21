package br.com.digitalhouse.exemplo1

fun main() {
    try {
        val lista = listOf("Pato", "Cachorro", "Gato")
        println("Terceiro elemento: ${lista.get(3)}")
    } catch (ex: Exception){
        println("Ocorreu uma exception ${ex.message}")
        ex.stackTrace
    }
}