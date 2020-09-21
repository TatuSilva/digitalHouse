package br.com.Aulas.`11`

fun main() {
    try {
        var arrayList = mutableListOf<String>()

        arrayList.add("Pato")
        arrayList.add("Cachorro")
        arrayList.add("Gato")

        println(arrayList.get(3))
    }catch (ex: Exception) {
        println("Erro")

    }





}