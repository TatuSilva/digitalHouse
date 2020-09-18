package br.digitalHouse.Aula6.Ingresso

class Teste {
}

fun main() {

    //pq eu não consigo passar o valor colocado aqui para as outras instâncias?
    // Pq estou tendo que digitar todos os valores de novo, inclusive o que já foi incializado,
    //como o adicionalSuperior, por exemplo?

        println("Qual o valor do ingresso?")
    val valorIngresso = readLine()!!.toDouble()
        var ingresso1 = Ingresso(valorIngresso)

        println("Digite 1 para ingresso normal e 2 para ingresso VIP:")
    val tipoIngresso = readLine()!!

    when(tipoIngresso){
        "1" -> {
            ingresso1 = Normal(ingresso1.valor)
            ingresso1.imprime()
        }
        "2" -> {
            println("Digite 1 para camarote superior e 2 para camarote inferior:")
            val camarote = readLine()!!
            when (camarote) {
                "1" -> {
                   var ingresso1 = CamaroteSuperior(ingresso1.valor)
                    ingresso1.imprime()
                }
                "2" -> {
                   var ingresso1 = CamaroteInferior("C4", ingresso1.valor)
                    ingresso1.imprime()
                }
            }
        }
    }

}