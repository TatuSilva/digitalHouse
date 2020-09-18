package br.digitalHouse.Aula6.Interfaces

open class Impressora (var imprimivel: Imprimivel){
    open val listaImprimivel = mutableListOf<Imprimivel>()
    fun addImpressora () {
        listaImprimivel.addAll(listOf(imprimivel))
    }
    fun imprimeLista () {
        for (element in listaImprimivel){
            element.imprimir()
        }
    }
}

