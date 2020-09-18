package br.DigitalHouse.Aula09.Exercicio04

open abstract class Peca(open var marca: String ="", open var modelo: String ="") {
    open fun retirada(){}
}