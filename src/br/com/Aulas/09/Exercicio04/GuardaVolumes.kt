package br.DigitalHouse.Aula09.Exercicio04

open class GuardaVolumes() : Peca(){
    //override var marca: String, override var modelo: String
    open var contador: Int = 0
    open var dicionario : MutableMap<Int, MutableList<String>> = mutableMapOf()

    open fun guardarPecas(marca: String, modelo: String){
        contador ++
        dicionario[contador] = mutableListOf("$marca", "$modelo")
        println("Para retirar sua roupa use este código: ${contador}")
    }

    open fun mostrarPecas() {
        dicionario.forEach {println("ID: ${it.key} -- Peça: ${it.value}")}
    }
    open fun devolverPecas(codigo:Int){
        dicionario.remove(codigo)
        mostrarPecas()
    }

}
