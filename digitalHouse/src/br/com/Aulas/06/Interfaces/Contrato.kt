package br.digitalHouse.Aula6.Interfaces

open class Contrato (override var nome: String = "muito legal", override var tipoDocumento: String = "contrato"): Imprimivel{
    override fun imprimir(){
        println("Eu sou um $tipoDocumento $nome")
    }
}