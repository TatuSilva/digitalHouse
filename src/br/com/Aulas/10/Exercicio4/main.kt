package br.com.Aulas.`10`.Exercicio4

fun main() {
    var vendedor = Funcionario("Maria", 1)
    var gerente = Funcionario("Pedro", 2)
    var faxineiro = Funcionario("Artur", 3)
    var ceo = Funcionario("Laura", 4)

    var funcionarios = listOf<Funcionario>(vendedor, gerente, faxineiro, ceo)

    var recepcionista = Funcionario("Patricia", 2)

   println(funcionarios.contains(recepcionista))
}