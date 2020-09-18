package digitalHouse.ExerciciosKotlin2.Jogadores

class Exercicio2

fun main(){
    val jogador1 = JogadorDeFutebol("Marta", 100, 20, 0, 5)
    val jogador2 = JogadorDeFutebol("Junior", 70, 50, 2, 10)
    jogador1.fazerGol()
    jogador2.correr()
    val sessao1 = SessaoDeTreinamento(jogador1)
    val sessao2 = SessaoDeTreinamento(jogador2)
    sessao1.treinarA()
    sessao2.treinarA()
}