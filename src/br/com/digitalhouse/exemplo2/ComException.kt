package br.com.digitalhouse.exemplo2

fun main(){
    val lista = mutableListOf<String?>(null)
    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")
    print("Conteúdo da posição 2: ${lista.get(2)}")

}