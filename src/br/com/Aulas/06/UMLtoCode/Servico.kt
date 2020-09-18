package br.digitalHouse.Aula6.UMLtoCode

class Servico (var descricao: String ="", var horas: Int = 0, var precoHora: Double = 0.00):IRecebiveis{
    override fun totalizarReceita(): Double {
        return horas*precoHora
    }

    fun Servico(){
        println("$descricao x $horas horas -- valor unitário: $precoHora -- valor total: ${totalizarReceita()} ")
    }
    fun toString(servico: Servico): String {
        return servico.toString()
    }
}