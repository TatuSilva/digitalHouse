package br.digitalHouse.Aula6.Ingresso

open class CamaroteInferior (var localizacao: String = "", valor: Double): Vip(valor){
    override fun imprime () {
        println("Ingresso VIP Camarote Inferior \n localização: $localizacao \n Valor: ${valorVip()}")
    }
}