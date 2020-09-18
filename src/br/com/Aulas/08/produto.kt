package digitalHouse
//Escreva uma classe que receba uma lista de números e uma função que imprime no console o produto ou seja o resultado de multiplicar todos os elementos entre si.
//Por exemplo: array[1, 4, 7] deve imprimir 28, que é 1 * 4 * 7.

class Produto(var arr: ArrayList<Int>) {
    fun multiplica (arr: ArrayList<Int>): Int {
        var resultado = 1
         for (i in 0..(arr.size-1)) {
            resultado *= arr[i]
         };
        return resultado
    }

     init{
         println(multiplica(arr))
     }
}