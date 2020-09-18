package digitalHouse.ExerciciosKotlin2.ClientesContas

class Exercicio1

fun main(){
    val cliente1 = Cliente("Tainá", "Moraes")
    val cliente2 = Cliente("Cristina", "Dias")
    val contaCliente1 = Conta(124864,0.00, cliente1)
    val contaCliente2 = Conta(124865,10000.00, cliente2)

    contaCliente1.deposito(5.00)
    contaCliente2.deposito(200.00)

    contaCliente1.saque(20.00)
    contaCliente2.saque(100.75)
    contaCliente2.saque(100.00)

    contaCliente1.saldo(124864)
}