package br.com.Aulas.`10`.Exercicio2

data class Coca(var tamanho: Int, var preco: Double) {
    override fun equals(other: Any?): Boolean {
        if (other == this.tamanho) {
           return true
        }
        return false
    }
}