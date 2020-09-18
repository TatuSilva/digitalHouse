package br.com.digitalhouse.Aula03

//Escrever o código que deve analisar um número inteiro e, caso ele seja par,
// retornar true, caso contrário, retorna false.

fun main(){
    println(par(17))
}

fun par (num:Int):Boolean{
    return num % 2 == 0
}