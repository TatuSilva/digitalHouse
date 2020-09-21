package br.com.Aulas.`11`

fun main() {
    try {
        var lista = mutableListOf<String?>()

        lista.add("Pato")
        lista.add("Cachorro")
        lista.add("Gato")

        println(lista.get(2))
    } catch (ex: Exception){
        println("Deu ruim! Posição inválida")
    }
}