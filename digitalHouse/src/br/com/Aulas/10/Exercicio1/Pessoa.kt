package br.com.Aulas.`10`.Exercicio1

data class Pessoa(var nome: String, var rg: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == this.rg) {
            return true
        }
        return false
    }
    }
