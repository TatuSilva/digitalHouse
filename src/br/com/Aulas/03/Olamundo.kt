package br.com.Aulas.`03`

fun main () {
    println("Olá mundo!")
    println(mostrarMeuNome("Moraes", 32))
    println(alunosAndroid())
    println("forEach")
    for (nome in alunosAndroid()){
        println("nome do aluno: $nome")
    }
    println("for")
    for (nome in 0 .. alunosAndroid().size-1){
        println("nome do aluno: ${alunosAndroid()[nome]}")
    }
}

fun mostrarMeuNome(sobrenome: String, idade: Int): String{
    val idadeRecebida = when (idade) {

        18 -> "maior de idade"
        32 -> "adulto"
        65 -> "idoso"
        else -> "não se sabe a idade"

    }


    return "Tainá $sobrenome e idade $idadeRecebida"
}

fun alunosAndroid (): ArrayList<String> {
    val listaAlunos = arrayListOf<String>()
    listaAlunos.add("Tainá")
    listaAlunos.add("Cristina")
    listaAlunos.add("Dominó")
    listaAlunos.add("Jurubeba")

    return listaAlunos
}