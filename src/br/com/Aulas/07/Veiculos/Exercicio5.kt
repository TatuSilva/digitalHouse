package digitalHouse.ExerciciosKotlin2.Veiculos

class Exercicio5

fun main() {
    val carro1 = Veículo("Fusca", "Novo", 2020,"Vermelho", 0.00)
    val cliente1 = Cliente("João", "Silva","9999-9999")
    val venda1 = Venda(cliente1, carro1, 100000.00)
    val registro1 = Concessionaria(carro1, cliente1, venda1)
    registro1.registrarVenda()
}