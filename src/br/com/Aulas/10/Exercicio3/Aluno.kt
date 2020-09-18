package br.com.Aulas.`10`.Exercicio3

data class Aluno (var nome: String, var numeroDeAluno:Int) {
    override fun equals(other: Any?): Boolean {
        if (other == this.numeroDeAluno) {
            return true
        }
        return false
    }
}