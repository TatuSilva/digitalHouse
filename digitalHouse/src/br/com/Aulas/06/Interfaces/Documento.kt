package br.digitalHouse.Aula6.Interfaces

open class Documento (override var nome: String = "word", override var tipoDocumento: String = "documento"): Imprimivel{
    override fun imprimir(){
        println("Eu sou um $tipoDocumento $nome")
    }
}