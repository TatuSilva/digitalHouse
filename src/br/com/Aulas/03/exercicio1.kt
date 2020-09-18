package br.com.Aulas.`03`

fun maiorInt(num1:Int, num2:Int, num3:Int):Int {
    var maior = num1
    if (num2 > num1 && num2 > num3) {
        maior = num2
    }else if(num3 > num1 && num3 > num2) {
        maior = num3
    }else{
        maior = num1
    }
    return maior
}
fun main(){
    print(maiorInt(205555, 12052, 852))
}