package br.com.digitalhouse.Aula03
//Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.
fun main(){
        print(trueOrFalse("pão", "pão"))
}

fun trueOrFalse (str1: String,str2:String) :Boolean {
    return str1 !== str2
}
