package br.digitalHouse.Aula6.UMLtoCode

class RegistroRecebimento(IRecebiveis: Double){
    var itemVenda: String = ""

    var servico: String = ""

    val recebimentosLista = mutableListOf<Servico>() + mutableListOf<ItemVenda>()

    fun registroRecebimento(servico: Servico, itemVenda: ItemVenda) {
//       recebimentosLista.add(Servico())
     }

    var total :Double = 0.00

    fun adicionarRecebimento(r: Double) {
        total += r
    }

//    fun apresentarRecebimentos() : Unit {
//        println("${registroRecebimento()} \n TOTAL: ${adicionarRecebimento(total)}")
//    }


}




