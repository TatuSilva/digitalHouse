package br.com.Aulas.`10`.Exercicio3

fun main() {
    var aluno1 = Aluno("Maria", 1)
    var aluno2 = Aluno("João", 2)
    var aluno3 = Aluno("Helena", 3)
    var aluno4 = Aluno("Carla", 4)

    val listaAlunos = listOf<Aluno>(aluno1, aluno2, aluno3, aluno4)

    var aluno5 = Aluno("Pedro", 4)

    println(listaAlunos.contains(aluno5))
}