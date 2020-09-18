package digitalHouse.ExerciciosKotlin2.Veiculos

class Concessionaria (var veículo: Veículo, var cliente: Cliente, var venda: Venda){
    fun registrarVenda(){
//        venda.veículo = veículo
//        venda.cliente = cliente
//        venda.valor = valor
        println("Nova Venda: \n Cliente: ${cliente.nome} \n Carro: ${veículo.marca} \n Valor: ${venda.valor}")
    }
}