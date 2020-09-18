package br.com.Aulas.`10`.Exercicio4

data class Funcionario(var nome: String, var numeroRegistro:Int) {
    override fun equals(other: Any?): Boolean {
        if (other == this.numeroRegistro) {
            return true
        }
        return false
    }
}