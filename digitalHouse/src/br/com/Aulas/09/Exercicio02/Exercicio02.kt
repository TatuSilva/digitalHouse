package br.DigitalHouse.Aula09.Exercicio02

class Exercicio02 {
}

fun main() {
    val lista = mutableListOf<Int>()
    lista.add(1)
    lista.add(5)
    lista.add(5)
    lista.add(6)
    lista.add(7)
    lista.add(8)
    lista.add(8)
    lista.add(8)
    //Lista: [1, 5, 5, 6, 7, 8, 8, 8]
    val set = mutableSetOf<Int>()
    set.add(1)
    set.add(5)
    set.add(5)
    set.add(6)
    set.add(7)
    set.add(8)
    set.add(8)
    set.add(8)
    //Set: [1, 5, 6, 7, 8] -> set só aceita valores únicos e não tem index, ou seja não tem posição definida
    println("Lista: $lista")
    println("Set: $set")
}