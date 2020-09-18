package br.digitalHouse.Aula6.Ingresso

open class CamaroteSuperior (valor: Double): Vip(valor)  {
    fun valorSuperior(): Double {
        return valorVip() + 30.00
    }
    override fun imprime () {
        println("Ingresso VIP Camarote Superior \n Valor: ${valorSuperior()}")
    }
}