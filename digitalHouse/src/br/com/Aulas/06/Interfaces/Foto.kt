package br.digitalHouse.Aula6.Interfaces

open class Foto (override var nome: String = "selfie", override var tipoDocumento: String = "Foto"): Imprimivel{
    override fun imprimir(){
        println("Eu sou uma $tipoDocumento $nome")
    }
}