package br.DigitalHouse.Aula09.Exercicio03

class Prova {
    var inteiros = setOf(1,2,3,4,5)
    var total = 0
    public fun somaTotal(){
        for (element in inteiros) {
            total += element
        }
     println(total)
    }
}