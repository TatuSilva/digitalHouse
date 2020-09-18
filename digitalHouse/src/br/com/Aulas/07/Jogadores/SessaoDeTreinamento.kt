package digitalHouse.ExerciciosKotlin2.Jogadores

class SessaoDeTreinamento(var jogadorDeFutebol: JogadorDeFutebol){
    fun treinarA(){
        println("-------------------- \n Sessão de Treinamento")
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()
        println("Experiência Inicial ${jogadorDeFutebol.nome}: ${jogadorDeFutebol.experiencia}")
        jogadorDeFutebol.experiencia += 1
        println("Experiência Final ${jogadorDeFutebol.nome}: ${jogadorDeFutebol.experiencia}")
    }

}