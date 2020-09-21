package br.com.digitalhouse.exemplo2//package br.com.digitalhouse.exemplo2

fun main(){
    val lista = mutableListOf<String?>("")

    println("Digite um número e receba um bicho:")

    var posicao: String? = readLine()

    try {
        lista.add("Pato")
        lista.add("Cachorro")
        lista.add("Gato")
        if (posicao != null) {
            print("Conteúdo da posição $posicao: ${lista.get(posicao.toInt())}")
        }
    }catch (ex: Exception){
        println("Vixi... Deu ruim... Tente um novo número")
    }

}