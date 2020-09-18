package digitalHouse.ExerciciosKotlin2.ClientesContas

class Conta(var numeroConta: Int, var saldo: Double, var titular: Cliente){
    fun deposito(qntDinheiro: Double){
        saldo += qntDinheiro

        println ("----DADOS DE DEPÓSITO---- \n Cliente: ${titular.nome} ${titular.sobrenome}\n Conta: $numeroConta \n Valor depositado: $qntDinheiro \n Saldo: R$ $saldo \n------------------------")
    }

    fun saque (qntDinheiro: Double){

        if(saldo - qntDinheiro < 0) println("----DADOS DO SAQUE---- \n Cliente: ${titular.nome} ${titular.sobrenome}\n Conta: $numeroConta \n SALDO INSUFICIENTE \n------------------------")
        if(saldo - qntDinheiro > 0) {
            saldo -= qntDinheiro
            println("----DADOS DO SAQUE---- \n Cliente: ${titular.nome} ${titular.sobrenome}\n Conta: $numeroConta \n Valor Retirado: $qntDinheiro \n Saldo: R$ $saldo \n------------------------")
        }
//        when {
//            (saldo - qntDinheiro) < 0 -> println("----DADOS DO SAQUE---- \n Cliente: ${titular.nome} ${titular.sobrenome}\n Conta: $numeroConta \n SALDO INSUFICIENTE \n------------------------")
//            else ->  println("----DADOS DO SAQUE---- \n Cliente: ${titular.nome} ${titular.sobrenome}\n Conta: $numeroConta \n Valor Retirado: $qntDinheiro \n Saldo: R$ $saldo \n------------------------")
//
//        }
    }

    fun saldo (numeroConta: Int){
        println("----SALDO---- \n Cliente: ${titular.nome} ${titular.sobrenome}\n Conta: $numeroConta \n Saldo: R$ $saldo \n------------------------")
    }
}