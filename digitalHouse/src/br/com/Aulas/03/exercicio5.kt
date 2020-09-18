package br.com.digitalhouse.Aula03

//Escrever um código que deve analisar quatro números inteiros e, caso numA seja maior que numC e numD
// ou caso numB seja maior que numC e numD, retornar true, caso contrário, retornar false.

fun isThisTrue (numA:Int,numB:Int,numC:Int,numD:Int): Boolean {
    return numA > numC && numA > numD || numB > numC && numB > numD
}

fun main(){
    print(isThisTrue(2, 6, 9, 6))
}