//Escreva uma classe que receba como parâmetro um número e uma função que calcule o fatorial desse número e imprima no console.
//Ex.: 3! = 3 * 2 * 1 = 6

class Fatorial (var num:Int){
    fun fatorando (num: Int): Int {
        var fat = 1
        for(i in 1..num) fat *= i;
        return fat;
    }
            init{
                println("Fatorial de $num é ${fatorando(num)}")
            }
}